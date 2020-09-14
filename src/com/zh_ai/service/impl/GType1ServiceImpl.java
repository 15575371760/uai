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
     * ��ѯ���е���Ʒ����������
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
     * �޸Ķ�Ӧ�Ĵ���Ʒ����
     * @param type
     * @return
     */
    @Override
    public int setInfo(Goods_Type type) {
        return 0;
    }
    /**
     * ɾ����Ӧ����Ʒ�����ͣ�����ɾ����һ����������ɾ��
     * @param type
     * @return
     */
    @Override
    public int delInfo(Goods_Type type) {
        return 0;
    }
    /**
     * ��һ����Ʒ���ͱ������һ������
     * @param type Ҫ��ӵ�����
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
