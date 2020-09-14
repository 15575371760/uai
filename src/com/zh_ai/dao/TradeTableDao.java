package com.zh_ai.dao;

import java.util.List;

import com.zh_ai.entity.TradeTable;

/**
 * ���ﳵ��ӿ�
 * @author ľګ����
 *
 */
public interface TradeTableDao {
	/**
	 * ��ѯ��¼�û�����Ĺ��ﳵ��Ϣ
	 * @param uid
	 * @return
	 */
	public List<TradeTable> getTradeTableInfo(String uid);
	/**
	 * �鿴����������Ϣ
	 * @param tid
	 * @return
	 */
	public TradeTable getInfo(int tid);
	/**
	 * �鿴������Ʒ�����빺�ﳵ�Ĵ���
	 * @return �����ж���������Ӧ��������
	 */
	public int getGoodsTradeTable(int tid);
	/**
	 * ��ѯ���ﳵ�����Ϣ����
	 * @return
	 */
	public int getTradeNumBer();

	/**
	 * ���һ�����ﳵ��Ϣ
	 * @param tt
	 * @return
	 */
	public int insert(TradeTable tt);

	/**
	 * ����һ�����ﳵ��Ϣ��ע���û������иù��ﳵ��Ϣʱ��ӽ����޸�
	 * @param tt
	 * @return
	 */
	public int update(TradeTable tt);

	/**
	 * ɾ��һ�����ﳵ��Ϣ
	 * @param del
	 * @return
	 */
	public int del (int del);
	
}
