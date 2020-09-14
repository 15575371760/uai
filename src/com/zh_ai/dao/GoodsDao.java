package com.zh_ai.dao;

import java.util.List;
import java.util.Map;

import com.zh_ai.entity.Goods;
import org.apache.ibatis.annotations.*;

/**
 * 商品表对应接口
 * @author 木讷呆神
 *
 */
public interface GoodsDao {
	/**
	 * 查询所有商品信息
	 * @return
	 */
	public List<Goods> getAllInfo();

	/**
	 * 按所給条件查询
	 * @param map
	 * @return
	 */
	public List<Goods> getInfo(Map map);
	/**
	 * 向商品表中添加一条商品信息
	 * @param goods
	 * @return
	 */
	public int addInfo(Goods goods);
	/**
	 * 修改单个商品信息
	 * @param goods
	 * @return
	 */
	public int setInfo(Goods goods);
	/**
	 * 删除选中的商品信息
	 * @param id 对应的商品编号
	 * @return
	 */
	public int delInfo(int id);
	
	//新加的功能
	/**
	 * 查询当个商品的信息
	 * @param id 需要查询的商品编号
	 * @return 返回商品对象
	 */
	public Goods getGoodsInfo(int id);
	/**
	 * 按对应的商品类型查询商品
	 * @param typeOne 一级商品类型编号
	 * @return 返回商品集合
	 */
	public List<Goods> getTypeGoodsInfo(int typeOne);
	/**
	 * 按商品名称获取对应的商品信息(模糊查询)
	 * @param name
	 * @return
	 */
	public List<Goods> getNameGoodsInfo(String name);
	/**
	 * 查询销量前10的商品信息
	 * @return
	 */
	public List<Goods> getDesc10();
	
	
	
	
	/////
	/////复制张贴下没报错的代码方法
	/////
	/**
	 * 按商品名称获取对应的商品信息(模糊查询)
	 * @param name 名字
	 * @param id 商品编号
	 * @param currentPage 当前页码
	 * @param pageSize 页面尺寸
	 * @return  返回集合对象
	 */
	public List<Goods> getNameGoodsInfo(String name,int id,int currentPage,int pageSize);
	/**
	 * 根据商品名字或者ID号得到商品总记录数
	 * @param name 商品名字
	 * @param id	商品编号
	 * @return	总记录数
	 */
	public int getGoodsCountByName(String name,int id);
	public int getCount(Integer id, String name);
	public List<Goods> findPageGoods(int pageNum, int pageSize, Integer id, String name);
	
	
	
	
	
	
	
	
}
