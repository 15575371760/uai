package com.zh_ai.entity;
/**
 * �û����Ӧ��
 * @author ľګ����
 *
 */
public class User {
	private String id;//�û��˺�
	private String pwd;//�û�����
	private String name;//�û��ǳ�
	private int sex;//�û��Ա� 0Ů 1��
	private int age;//�û�����
	private String idNO;//�û�֤����
	private String phone;//��ϵ�绰
	private String address;//��ס��ַ
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
