package com.zh_ai.service;

import java.util.List;

import com.zh_ai.entity.TradeTable;

/**
 * ���ﳵҵ���߼��㹦�ܽӿ�
 * @author ľګ����
 *
 */
public interface TradeTableService {
	/**
	 * ��ѯ��¼�û�����Ĺ��ﳵ��Ϣ
	 * @param uid
	 * @return
	 */
	public List<TradeTable> getTradeTableInfo(String uid);
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
	
}
