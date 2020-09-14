package com.zh_ai.entity;
/**
 * 对应管理员的类
 * @author 木讷呆神
 *
 */
public class Sys {
	private String id;//管理员账号
	private String pwd;//管理员密码
	private String name;//操作人姓名
	private int grade;//管理员等级 0老板 1员工
	private String a;
	private String b;
	private String c;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
