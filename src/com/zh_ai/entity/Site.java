package com.zh_ai.entity;
/**
 * 收货地址对应类
 * @author 木讷呆神
 *
 */
public class Site {
	private int id;//收货地址编号
	private User user;//对应的用户账号
	private String name;//收件人
	private String site;//收货地址
	private String contactway;//收件人联系方式、
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
