package com.zh_ai.service;

import java.util.List;
import java.util.Map;

import com.zh_ai.entity.Goods;
import com.zh_ai.util.Page;
import org.apache.ibatis.annotations.Select;

/**
 * ��Ʒ����ҵ���߼��㹦�ܽӿ�
 * @author ľګ����
 *
 */
public interface GoodsService {
	/**
	 * ��ѯ������Ʒ��Ϣ
	 * @return
	 */
	public List<Goods> getAllInfo();
	/**
	 * �����o������ѯ
	 * @param
	 * @return
	 */
	public List<Goods> getInfo(String name,int count);
	/**
	 * ����Ʒ�������һ����Ʒ��Ϣ
	 * @param goods
	 * @return
	 */

	public int addInfo(Goods goods);
	/**
	 * �޸ĵ�����Ʒ��Ϣ
	 * @param goods
	 * @return
	 */
	public int setInfo(Goods goods);
	/**
	 * ɾ��ѡ�е���Ʒ��Ϣ
	 * @param id ��Ӧ����Ʒ���
	 * @return
	 */
	public int delInfo(int id);
	
	//�¼ӵĹ���
	/**
	 * ��ѯ������Ʒ����Ϣ
	 * @param id ��Ҫ��ѯ����Ʒ���
	 * @return ������Ʒ����
	 */
	public Goods getGoodsInfo(int id);
	/**
	 * ����Ӧ����Ʒ���Ͳ�ѯ��Ʒ
	 * @param typeOne һ����Ʒ���ͱ��
	 * @param typeTwo ������Ʒ���ͱ��
	 * @return ������Ʒ����
	 */
	public List<Goods> getTypeGoodsInfo(int typeOne,int typeTwo);
	/**
	 * ����Ʒ���ƻ�ȡ��Ӧ����Ʒ��Ϣ(ģ����ѯ)
	 * @param name
	 * @return
	 */
	public List<Goods> getNameGoodsInfo(String name);
	/**
	 * ��ѯ����ǰ10����Ʒ��Ϣ
	 * @return
	 */
	public List<Goods> getDesc10();
	
	
	
	
	
	
	
	
	
	
	/**
	 * ��ȡ��Ʒ�ܼ�¼��
	 * @return
	 */

	public int totalCount();
	
	/**
	 * ����Ʒ���ƻ�ȡ��Ӧ����Ʒ��Ϣ(ģ����ѯ)
	 * @param name ����
	 * @param id ��Ʒ���
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ҳ��ߴ�
	 * @return  ����һ����Ʒ����ʵ����
	 */
	public Page<Goods> getNameGoodsInfo(String name,int id,int currentPage,int pageSize);
	public Page<Goods> findPageGoods(int pageNum, int pageSize, Integer id, String name);
}
