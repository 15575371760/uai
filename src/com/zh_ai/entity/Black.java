package com.zh_ai.entity;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

/**
 * ��������Ӧ����
 * @author ľګ����
 *
 */

public class Black {
	private User user;//ѡ�������û�(һ��һ)
	private String initialDate;//��ʼʱ��
	private String date;//��ֹʱ��
	private String a;
	private String b;
	private String c;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Black{" +
				"uid='" + user + '\'' +
				", initialDate='" + initialDate + '\'' +
				", date='" + date + '\'' +
				", a='" + a + '\'' +
				", b='" + b + '\'' +
				", c='" + c + '\'' +
				'}';
	}
}
