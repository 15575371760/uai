package com.zh_ai.entity;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * 对应评论表的类
 * @author 木讷呆神
 *
 */
public class Comment {
	private int id;//评论编号
	private User user;//用户(一对一)
	private Order order;//订单(一对一)
	private Goods goods;//商品(一对一)
	private String dateTime;//评论时间
	private String text1;//评论信息
	private String DateTime2;//追加评论时间
	private String text2;//追加评论信息
	private String a;
	private String b;
	private String c;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getuId() {
		return user;
	}
	public void setuId(User user) {
		this.user = user;
	}
	public Order getoId() {
		return order;
	}
	public void setoId(Order order) {
		this.order = order;
	}
	public Goods getgId() {
		return goods;
	}
	public void setgId(Goods goods) {
		this.goods = goods;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getText1() {
		return text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}
	public String getDateTime2() {
		return DateTime2;
	}
	public void setDateTime2(String dateTime2) {
		DateTime2 = dateTime2;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}

	@Override
	public String toString() {
		return "Comment{" +
				"id=" + id +
				", user=" + user +
				", order=" + order +
				", goods=" + goods +
				", dateTime='" + dateTime + '\'' +
				", text1='" + text1 + '\'' +
				", DateTime2='" + DateTime2 + '\'' +
				", text2='" + text2 + '\'' +
				", a='" + a + '\'' +
				", b='" + b + '\'' +
				", c='" + c + '\'' +
				'}';
	}
}
