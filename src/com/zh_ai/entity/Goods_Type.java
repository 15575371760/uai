package com.zh_ai.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * ��Ӧ��Ʒ�����ͱ����
 * @author ľګ����
 *
 */
public class Goods_Type {
	private int id;//���ͱ��
	private String name;//��Ʒ����������
	private String image;
	private List<Goods> goods;
	private String a;
	private String b;
	private String c;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

//	@JSONField(serialize = false)
	public List<Goods> getGid() {
		return goods;
	}

	public void setGid(List<Goods> gid) {
		this.goods = gid;
	}

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

	@Override
	public String toString() {
		return "Goods_Type{" +
				"id=" + id +
				", name='" + name + '\'' +
				", image='" + image + '\'' +
				", goods=" + goods +
				", a='" + a + '\'' +
				", b='" + b + '\'' +
				", c='" + c + '\'' +
				'}';
	}
}
