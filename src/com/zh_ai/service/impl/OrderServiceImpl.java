package com.zh_ai.service.impl;

import com.zh_ai.dao.OrderDao;
import com.zh_ai.entity.Order;
import com.zh_ai.service.OrderService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
/**
 * ҵ���߼��㹦�ܽӿ�ʵ����
 * @author dell
 *
 */
public class OrderServiceImpl implements OrderService {
    /**
     * ��������Ų�ѯ������Ϣ
     * @param oid
     * @return
     */
    @Override
    public Order getInfo(String oid) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            OrderDao dao=session.getMapper(OrderDao.class);
            return  dao.getInfo(oid);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
    /**
     * ��ѯ���еĶ�����Ϣ�������Ҫ���࣬����ҵ���߼�����в���
     * @return
     */
    @Override
    public List<Order> getAllInfo() {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            OrderDao dao=session.getMapper(OrderDao.class);
            return  dao.getAllInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
    /**
     * ���û��˺�����ѯ�������
     * @param uid
     * @return
     */
    @Override
    public List<Order> getUidInfo(String uid) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            OrderDao dao=session.getMapper(OrderDao.class);
            return  dao.getUidInfo(uid);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
    /**
     * ������״̬��ѯ������Ϣ
     * @param no
     * @return
     */
    @Override
    public List<Order> getStatusInfo(int no) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            OrderDao dao=session.getMapper(OrderDao.class);
            return  dao.getStatusInfo(no);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
    /**
     * ��̨���������ɾ��
     * @param
     * @return
     */
    @Override
    public int delOrderInfo(String id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            OrderDao dao=session.getMapper(OrderDao.class);
            return  dao.delOrderInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }
    /**
     * ����������޸Ķ���״̬���Ƿ����ջ���
     * @param order
     * @return
     */
    @Override
    public int setOrderInfo(Order order) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            OrderDao dao=session.getMapper(OrderDao.class);
            return  dao.setOrderInfo(order);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }
    /**
     * ���һ��������Ϣ
     * @param order
     * @return
     */
    @Override
    public int addOrderInfo(Order order) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            OrderDao dao=session.getMapper(OrderDao.class);
            return  dao.addOrderInfo(order);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }
    /**
     * ��ѯָ���û������ж�����Ϣ
     * @param uid ָ���û���id
     * @return  List<Order>
     */
    @Override
    public List<Order> getOrderDetialInfo(String uid) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            OrderDao dao=session.getMapper(OrderDao.class);
            return  dao.getOrderDetialInfo(uid);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
