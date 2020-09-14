package com.zh_ai.dao;

import java.util.List;
import java.util.Map;

import com.zh_ai.entity.Goods;
import org.apache.ibatis.annotations.*;

/**
 * ��Ʒ���Ӧ�ӿ�
 * @author ľګ����
 *
 */
public interface GoodsDao {
	/**
	 * ��ѯ������Ʒ��Ϣ
	 * @return
	 */
	public List<Goods> getAllInfo();

	/**
	 * �����o������ѯ
	 * @param map
	 * @return
	 */
	public List<Goods> getInfo(Map map);
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
	 * @return ������Ʒ����
	 */
	public List<Goods> getTypeGoodsInfo(int typeOne);
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
	
	
	
	
	/////
	/////����������û����Ĵ��뷽��
	/////
	/**
	 * ����Ʒ���ƻ�ȡ��Ӧ����Ʒ��Ϣ(ģ����ѯ)
	 * @param name ����
	 * @param id ��Ʒ���
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ҳ��ߴ�
	 * @return  ���ؼ��϶���
	 */
	public List<Goods> getNameGoodsInfo(String name,int id,int currentPage,int pageSize);
	/**
	 * ������Ʒ���ֻ���ID�ŵõ���Ʒ�ܼ�¼��
	 * @param name ��Ʒ����
	 * @param id	��Ʒ���
	 * @return	�ܼ�¼��
	 */
	public int getGoodsCountByName(String name,int id);
	public int getCount(Integer id, String name);
	public List<Goods> findPageGoods(int pageNum, int pageSize, Integer id, String name);
	
	
	
	
	
	
	
	
}
