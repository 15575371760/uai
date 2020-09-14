package com.zh_ai.util;

import java.util.List;

import com.zh_ai.entity.Goods;

/**
 * ��ѯ��Ʒ�ķ�ҳ
 * @author dell
 *
 */
public class Page<T> {
	private int currentPage;//��ǰҳ�룬�ڼ�ҳ
	private int pageSize;//ҳ���С����ÿҳ��ʾ������
	private int totalCount;//�ܼ�¼��
	private int totalPage;//��ҳ��
	private List<T> listGoods;//��ǰ������ʾ�ľ�������
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		this.totalPage=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getListGoods() {
		return listGoods;
	}
	public void setListGoods(List<T> listGoods) {
		this.listGoods = listGoods;
	}
	
}
