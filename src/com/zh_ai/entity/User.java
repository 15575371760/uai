package com.zh_ai.entity;
/**
 * 用户表对应类
 * @author 木讷呆神
 *
 */
public class User {
	private String id;//用户账号
	private String pwd;//用户密码
	private String name;//用户昵称
	private int sex;//用户性别 0女 1男
	private int age;//用户年龄
	private String idNO;//用户证件号
	private String phone;//联系电话
	private String address;//居住地址
	private String mailbox;
	private int status;
	private String a;
	private String b;
	private String c;

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIdNO() {
		return idNO;
	}
	public void setIdNO(String idNO) {
			this.idNO = idNO;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
			this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
			this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", pwd='" + pwd + '\'' +
				", name='" + name + '\'' +
				", sex=" + sex +
				", age=" + age +
				", idNO='" + idNO + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", mailbox='" + mailbox + '\'' +
				", status=" + status +
				", a='" + a + '\'' +
				", b='" + b + '\'' +
				", c='" + c + '\'' +
				'}';
	}
}
