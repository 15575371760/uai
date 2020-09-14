package com.zh_ai.dao;

import java.util.List;

import com.zh_ai.entity.Goods_Type;
import org.apache.ibatis.annotations.*;

/**
 * 商品大类型接口
 * @author 木讷呆神
 *
 */
@Mapper
public interface GType1Dao {
	/**
	 * 查询所有的商品大类型名称
	 * @return
	 */
	public List<Goods_Type> getAllInfo();

	/**
	 * 根据类型id获取类型
	 * @return
	 */
	public Goods_Type getTypeById(int id);
	/**
	 * 修改对应的大商品名称
	 * @param type
	 * @return
	 */
	public int setInfo(Goods_Type type);
	/**
	 * 删除对应的商品大类型，并在删除是一并将子类型删除
	 * @param type
	 * @return
	 */
	public int delInfo(Goods_Type type);
	/**
	 * 向一级商品类型表中添加一条数据
	 * @param type 要添加的名称
	 * @return
	 */
	public int addInfo(String type);

	
}
