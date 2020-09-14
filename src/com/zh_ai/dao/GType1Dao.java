package com.zh_ai.dao;

import java.util.List;

import com.zh_ai.entity.Goods_Type;
import org.apache.ibatis.annotations.*;

/**
 * ��Ʒ�����ͽӿ�
 * @author ľګ����
 *
 */
@Mapper
public interface GType1Dao {
	/**
	 * ��ѯ���е���Ʒ����������
	 * @return
	 */
	public List<Goods_Type> getAllInfo();

	/**
	 * ��������id��ȡ����
	 * @return
	 */
	public Goods_Type getTypeById(int id);
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
