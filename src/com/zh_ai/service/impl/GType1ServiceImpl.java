package com.zh_ai.service.impl;

import com.zh_ai.dao.GType1Dao;
import com.zh_ai.entity.Goods_Type;
import com.zh_ai.service.GType1Service;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.jms.Session;
import java.util.List;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/8 8:54
 */
public class GType1ServiceImpl implements GType1Service {
    /**
     * 查询所有的商品大类型名称
     * @return
     */
    @Override
    public List<Goods_Type> getAllInfo() {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            GType1Dao gType1Dao = session.getMapper(GType1Dao.class);
            return gType1Dao.getAllInfo();
        }finally {
            session.close();
        }
    }
    /**
     * 修改对应的大商品名称
     * @param type
     * @return
     */
    @Override
    public int setInfo(Goods_Type type) {
        return 0;
    }
    /**
     * 删除对应的商品大类型，并在删除是一并将子类型删除
     * @param type
     * @return
     */
    @Override
    public int delInfo(Goods_Type type) {
        return 0;
    }
    /**
     * 向一级商品类型表中添加一条数据
     * @param type 要添加的名称
     * @return
     */
    @Override
    public int addInfo(String type) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            GType1Dao gType1Dao = session.getMapper(GType1Dao.class);
            return gType1Dao.addInfo(type);
        }finally {
            session.close();
        }
    }
}
