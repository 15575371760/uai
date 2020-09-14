package com.zh_ai.service;

import java.util.List;

import com.zh_ai.entity.Site;

/**
 * 收获地址业务逻辑层功能接口
 * @author 木讷呆神
 *
 */
public interface SiteService {
	/**
	 * 按收货地址编号查看收货地址
	 * @param id
	 * @return
	 */
	public Site getSite(int id);
	/**
	 * 按用户账号查询收货地址
	 * @param uid
	 * @return
	 */
	public List<Site> getUidSite(String uid);
	/**
	 * 添加一条收货地址信息
	 * @param site
	 * @return
	 */
	public int addSite(Site site);
	/**
	 * 修改对应的收货地址信息
	 * @param site
	 * @return
	 */
	public int setSite(Site site);
	/**
	 * 按收货地址编号删除选中的收货地址信息
	 * @param site
	 * @return
	 */
	public int delSite(int id);
}
