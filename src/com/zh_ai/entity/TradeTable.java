package com.zh_ai.entity;
/**
 * ���ﳵ��Ķ�Ӧ��
 * @author ľګ����
 *
 */
public class TradeTable {
	private int id;//���ﳵ���
	private Goods goods;//��Ʒ���
	private int num ;//ѡ������
	private User user;//�û��˺�
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
