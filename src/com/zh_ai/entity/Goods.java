package com.zh_ai.entity;


/**
 * ��Ʒ���Ӧ��
 * @author ľګ����
 *
 */
public class Goods {
	private int id;//��Ʒ���
	private String name;//��Ʒ����
	private  Goods_Type type;//��Ʒ���ͱ��1;
	private double price;//��Ʒ����
	private int status;//��Ʒ����״̬ 0��̨ǿ���¼� 1���ϼ� 2ȱ��״̬
	private int count;//��Ʒ�����
	private int sales;//��Ʒ������
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
