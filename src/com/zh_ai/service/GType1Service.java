package com.zh_ai.service;

import java.util.List;

import com.zh_ai.entity.Goods_Type;
/**
 * 一级分类业务逻辑层接口
 * @author 木讷呆神
 *
 */
public interface GType1Service {

	/**
	 * 查询所有的商品大类型名称
	 * @return
	 */
	public List<Goods_Type> getAllInfo();
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
