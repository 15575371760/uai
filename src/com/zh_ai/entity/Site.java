package com.zh_ai.entity;
/**
 * �ջ���ַ��Ӧ��
 * @author ľګ����
 *
 */
public class Site {
	private int id;//�ջ���ַ���
	private User user;//��Ӧ���û��˺�
	private String name;//�ռ���
	private String site;//�ջ���ַ
	private String contactway;//�ռ�����ϵ��ʽ��
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
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getContactway() {
		return contactway;
	}
	public void setContactway(String contactway) {
		this.contactway = contactway;
	}
	public User getUid() {
		return user;
	}
	public void setUid(User uid) {
		this.user = user;
	}
}
