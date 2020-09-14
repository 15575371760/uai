package com.zh_ai.dao;

import java.util.List;

import com.zh_ai.entity.TradeTable;

/**
 * 购物车表接口
 * @author 木讷呆神
 *
 */
public interface TradeTableDao {
	/**
	 * 查询登录用户本身的购物车信息
	 * @param uid
	 * @return
	 */
	public List<TradeTable> getTradeTableInfo(String uid);
	/**
	 * 查看单个购物信息
	 * @param tid
	 * @return
	 */
	public TradeTable getInfo(int tid);
	/**
	 * 查看当个商品被加入购物车的次数
	 * @return 返回有多少条相対应的数据条
	 */
	public int getGoodsTradeTable(int tid);
	/**
	 * 查询购物车表的信息行数
	 * @return
	 */
	public int getTradeNumBer();

	/**
	 * 添加一条购物车信息
	 * @param tt
	 * @return
	 */
	public int insert(TradeTable tt);

	/**
	 * 更新一条购物车信息，注在用户本身含有该购物车信息时添加进行修改
	 * @param tt
	 * @return
	 */
	public int update(TradeTable tt);

	/**
	 * 删除一条购物车信息
	 * @param del
	 * @return
	 */
	public int del (int del);
	
}
