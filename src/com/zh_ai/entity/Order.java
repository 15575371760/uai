package com.zh_ai.entity;
/**
 * ��Ӧ���������
 * @author ľګ����
 *
 */
public class Order {
	private String id;//�������
	private User user;//�û��˺�
	private String phone;//�ռ�����ϵ��ʽ
	private Site site;//�ջ���ַ���
	private Goods goods;//��Ʒ���
	private int num;//�µ�����
	private double sumMoney;//�µ��ܽ��
	private String date;//�µ�����
	private int statusNo;//�������״̬ -1�û����� 0 δ���� 1 �ѷ��� 2�û�ǩ��
	private String remarks;//������ע
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
