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
     * ��ѯ�������ڵ�������Ϣ
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
     * ���û��˺Ų����Ƿ���ڱ������û�
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
     * �������Χ�ڵ�ʱ���ѯ��������û�
     * @param initialDate ��ʼʱ��
     * @param date ��ֹʱ��
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
     * ������ֱ��ɾ��
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
     * �޸ķ��ʱ��
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
     * ������������һ�����ݣ������һ���û���ʹ��Ȩ�ޣ�
     * ���жϸñ����Ƿ��и��ѱ�����û����˺���Ϣ
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
