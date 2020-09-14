package com.zh_ai.dao;

import java.util.List;

import com.zh_ai.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 对应订单表的接口
 * @author 木讷呆神
 *
 */
public interface OrderDao {
	/**
	 * 按订单编号查询订单信息
	 * @param oid
	 * @return
	 */
	public Order getInfo(String oid);
	/**
	 * 查询所有的订单信息，如果需要分类，则在业务逻辑层进行操作
	 * @return
	 */
	public List<Order> getAllInfo();
	/**
	 * 按用户账号来查询订单编号
	 * @param uid
	 * @return
	 */
	public List<Order> getUidInfo(String uid);
	/**
	 * 按订单状态查询订单信息
	 * @param no
	 * @return
	 */
	public List<Order> getStatusInfo(int no);
	/**
	 * 后台按订单编号删除
	 * @param
	 * @return
	 */
	public int delOrderInfo(String id);
	/**
	 * 按订单编号修改订单状态（是否已收货）
	 * @param order
	 * @return
	 */
	public int setOrderInfo(Order order);
	/**
	 * 添加一条订单信息
	 * @param order
	 * @return
	 */
	public int addOrderInfo(Order order);
	
	//——————————————————————————————————————————————
	
		/**
		 * 查询指定用户的所有订单信息
		 * @param uid 指定用户的id
		 * @return  List<Order>
		 */
		List<Order> getOrderDetialInfo(String uid);
	

}
