package com.zh_ai.entity;
/**
 * 对应订单表的类
 * @author 木讷呆神
 *
 */
public class Order {
	private String id;//订单编号
	private User user;//用户账号
	private String phone;//收件人联系方式
	private Site site;//收货地址编号
	private Goods goods;//商品编号
	private int num;//下单数量
	private double sumMoney;//下单总金额
	private String date;//下单日期
	private int statusNo;//订单完成状态 -1用户拒收 0 未发货 1 已发货 2用户签收
	private String remarks;//订单备注
	private String a;
	private String b;
	private String c;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getuId() {
		return user;
	}
	public void setuId(User uId) {
		this.user = user;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Site getSiteId() {
		return site;
	}
	public void setSiteId(Site site) {
		this.site = site;
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
	public double getSumMoney() {
		return sumMoney;
	}
	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getStatusNo() {
		return statusNo;
	}
	public void setStatusNo(int statusNo) {
		this.statusNo = statusNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
			this.remarks = remarks;
	}

}
