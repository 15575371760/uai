package com.zh_ai.service.impl;

import com.zh_ai.dao.OrderDao;
import com.zh_ai.entity.Order;
import com.zh_ai.service.OrderService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
/**
 * 业务逻辑层功能接口实现类
 * @author dell
 *
 */
public class OrderServiceImpl implements OrderService {
    /**
     * 按订单编号查询订单信息
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
     * 查询所有的订单信息，如果需要分类，则在业务逻辑层进行操作
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
     * 按用户账号来查询订单编号
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
     * 按订单状态查询订单信息
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
     * 后台按订单编号删除
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
     * 按订单编号修改订单状态（是否已收货）
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
     * 添加一条订单信息
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
     * 查询指定用户的所有订单信息
     * @param uid 指定用户的id
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
