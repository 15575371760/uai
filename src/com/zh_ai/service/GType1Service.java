package com.zh_ai.service;

import java.util.List;

import com.zh_ai.entity.Goods_Type;
/**
 * һ������ҵ���߼���ӿ�
 * @author ľګ����
 *
 */
public interface GType1Service {

	/**
	 * ��ѯ���е���Ʒ����������
	 * @return
	 */
	public List<Goods_Type> getAllInfo();
	/**
	 * �޸Ķ�Ӧ�Ĵ���Ʒ����
	 * @param type
	 * @return
	 */
	public int setInfo(Goods_Type type);
	/**
	 * ɾ����Ӧ����Ʒ�����ͣ�����ɾ����һ����������ɾ��
	 * @param type
	 * @return
	 */
	public int delInfo(Goods_Type type);
	/**
	 * ��һ����Ʒ���ͱ������һ������
	 * @param type Ҫ��ӵ�����
	 * @return
	 */
	public int addInfo(String type);
}
