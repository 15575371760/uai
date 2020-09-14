package com.zh_ai.entity;


/**
 * 商品表对应类
 * @author 木讷呆神
 *
 */
public class Goods {
	private int id;//商品编号
	private String name;//商品名称
	private  Goods_Type type;//商品类型编号1;
	private double price;//商品单价
	private int status;//商品货架状态 0后台强制下架 1已上架 2缺货状态
	private int count;//商品库存量
	private int sales;//商品销售量
	private String a;
	private String b;
	private String c;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Goods_Type getTypeId1() {
		return type;
	}
	public void setTypeId1(Goods_Type type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	
}
