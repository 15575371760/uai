package com.zh_ai.util;

import java.util.List;

import com.zh_ai.entity.Goods;

/**
 * 查询商品的分页
 * @author dell
 *
 */
public class Page<T> {
	private int currentPage;//当前页码，第几页
	private int pageSize;//页面大小，即每页显示的数量
	private int totalCount;//总记录数
	private int totalPage;//总页数
	private List<T> listGoods;//当前面所显示的具体内容
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
