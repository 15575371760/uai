package com.zh_ai.dao;

import java.util.List;

import com.zh_ai.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ��Ӧ������Ľӿ�
 * @author ľګ����
 *
 */
public interface OrderDao {
	/**
	 * ��������Ų�ѯ������Ϣ
	 * @param oid
	 * @return
	 */
	public Order getInfo(String oid);
	/**
	 * ��ѯ���еĶ�����Ϣ�������Ҫ���࣬����ҵ���߼�����в���
	 * @return
	 */
	public List<Order> getAllInfo();
	/**
	 * ���û��˺�����ѯ�������
	 * @param uid
	 * @return
	 */
	public List<Order> getUidInfo(String uid);
	/**
	 * ������״̬��ѯ������Ϣ
	 * @param no
	 * @return
	 */
	public List<Order> getStatusInfo(int no);
	/**
	 * ��̨���������ɾ��
	 * @param
	 * @return
	 */
	public int delOrderInfo(String id);
	/**
	 * ����������޸Ķ���״̬���Ƿ����ջ���
	 * @param order
	 * @return
	 */
	public int setOrderInfo(Order order);
	/**
	 * ���һ��������Ϣ
	 * @param order
	 * @return
	 */
	public int addOrderInfo(Order order);
	
	//��������������������������������������������������������������������������������������������
	
		/**
		 * ��ѯָ���û������ж�����Ϣ
		 * @param uid ָ���û���id
		 * @return  List<Order>
		 */
		List<Order> getOrderDetialInfo(String uid);
	

}
