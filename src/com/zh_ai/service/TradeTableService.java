package com.zh_ai.service;

import java.util.List;

import com.zh_ai.entity.TradeTable;

/**
 * 购物车业务逻辑层功能接口
 * @author 木讷呆神
 *
 */
public interface TradeTableService {
	/**
	 * 查询登录用户本身的购物车信息
	 * @param uid
	 * @return
	 */
	public List<TradeTable> getTradeTableInfo(String uid);
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
	
}
