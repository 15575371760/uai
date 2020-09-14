package com.zh_ai.entity;
/**
 * 购物车表的对应类
 * @author 木讷呆神
 *
 */
public class TradeTable {
	private int id;//购物车编号
	private Goods goods;//商品编号
	private int num ;//选择数量
	private User user;//用户账号
	private String a;
	private String b;
	private String c;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Goods getGid() {
		return goods;
	}
	public void setGid(Goods gid) {
		this.goods = goods;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public User getUid() {
		return user;
	}
	public void setUid(User uid) {
		this.user = user;
	}
	
}
