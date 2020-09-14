package com.zh_ai.service;

import java.util.List;

import com.zh_ai.entity.Sys;
import com.zh_ai.util.Page;

/**
 * 管理员类的功能接口
 * @author dell
 *
 */
public interface SystemService {
	/**
	 * 查看所有管理员信息
	 * @return
	 */
	public Page getAllInfo(int currentPage, int pageSize);
	/**
	 * 查看一共注册了多少个管理员
	 * @return
	 */
	public int getAllCount();
	/**
	 * 按搜索账号查询指定账号信息
	 * @param id 被查询的管理员账号
	 * @return
	 */
	public Sys getInfo(String id);
	/**
	 * 按输入姓名查询管理员信息（可模糊查询）
	 * @param name
	 * @return
	 */
	public Page getNameInfo(String name,int currentPage,int pageSize);
	/**
	 * 按账号密码查询是否存在符合条件的管理员(登录)
	 * @param id 传入账号
	 * @param pwd 传入密码
	 * @return
	 */
	public Sys getInfo(String id,String pwd);
	/**
	 * 按等查询管理员信息
	 * @param i
	 * @return
	 */
	public List<Sys> getGradeInfo(int i);
	/**
	 * 修改指定管理员密码
	 * @param id 对应的账号
	 * @param pwd 原密码
	 * @param tpwd 新密码
	 * @return
	 */
	public int setPwd(String id,String pwd,String tpwd);
	/**
	 * 添加管理员
	 * @param
	 * @return
	 */
	public int addSystem(Sys sys);
	/**
	 * 删除指定管理员信息
	 * @param
	 * @return
	 */
	public int delSystem(Sys sys);

}

