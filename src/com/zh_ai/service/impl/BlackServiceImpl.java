package com.zh_ai.service.impl;

import com.zh_ai.dao.BlackDao;
import com.zh_ai.entity.Black;
import com.zh_ai.service.BlackService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/8 8:53
 */
public class BlackServiceImpl implements BlackService {
    /**
     * 查询黑名单内的所有信息
     * @return
     */
    @Override
    public List<Black> getAllBlack() {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            BlackDao blackDao = session.getMapper(BlackDao.class);
            List<Black> blackList = blackDao.getAllBlack();
            return blackList;
        }finally {
            session.close();
        }
    }
    /**
     * 按用户账号查找是否存在被禁掉用户
     * @param uid
     * @return
     */
    @Override
    public Black getUid(String uid) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            BlackDao blackDao = session.getMapper(BlackDao.class);
            Black black = blackDao.getUid(uid);
            return black;
        }finally {
            session.close();
        }
    }
    /**
     * 按封禁范围内的时间查询被封禁的用户
     * @param initialDate 开始时间
     * @param date 截止时间
     * @return
     */
    @Override
    public List<Black> getDateInfo(String initialDate, String date) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            BlackDao blackDao = session.getMapper(BlackDao.class);
            List<Black> blackList = blackDao.getDateInfo(initialDate,date);
            return blackList;
        }finally {
            session.close();
        }
    }
    /**
     * 误封禁，直接删除
     * @param uid
     * @return
     */
    @Override
    public int delDateInfo(String uid) {
        int num=0;
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            BlackDao blackDao = session.getMapper(BlackDao.class);
            num= blackDao.delDateInfo(uid);
            session.commit();
        }finally {
            session.close();
        }
        return 0;
    }
    /**
     * 修改封禁时间
     * @return
     */
    @Override
    public int setDateInfo(Black black) {
        int num=0;
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            BlackDao blackDao = session.getMapper(BlackDao.class);
            num= blackDao.setDateInfo(black);
            session.commit();
        }finally {
            session.close();
        }
        return num;
    }
    /**
     * 向黑名单表添加一条数据（即封禁一个用户的使用权限）
     * 并判断该表中是否含有该已被封禁用户的账号信息
     * @param black
     * @return
     */
    @Override
    public int insert(Black black) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            BlackDao blackDao = session.getMapper(BlackDao.class);
            Black object=blackDao.getUid(black.getUser().getId());
            if(object==null) {
                return blackDao.setDateInfo(black);
            }
        }finally {
            session.close();
        }
        return 0;
    }

}
