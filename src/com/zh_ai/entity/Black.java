package com.zh_ai.entity;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

/**
 * 黑名单对应的类
 * @author 木讷呆神
 *
 */

public class Black {
	private User user;//选择封禁的用户(一对一)
	private String initialDate;//开始时间
	private String date;//截止时间
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
