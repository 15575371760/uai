package com.zh_ai.dao;

import java.util.List;

import com.zh_ai.entity.Sys;
import org.apache.ibatis.annotations.Param;

/**
 * 管理员类的功能接口
 * @author 木讷呆神
 *
 */
public interface SystemDao {
	/**
	 * 查看所有管理员信息
	 * @return
	 */
	public List<Sys> getAllInfo();
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
	public List<Sys> getNameInfo(String name);
	/**
	 * 按账号密码查询是否存在符合条件的管理员(登录)
	 * @param id 传入账号
	 * @param pwd 传入密码
	 * @return
	 */
	public Sys getSysInfo(@Param("id") String id, @Param("pwd") String pwd);
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
	
	
	
	
	
	
	//////
	//////复制添加进来没有报错的方法
	//////
	/**
	 * 查看所有管理员信息
	 * @return
	 */
	public List<Sys> getAllInfo(int currentPage,int pageSize);
	/**
	 * 按输入姓名查询管理员信息（可模糊查询）
	 * @param name
	 * @return
	 */
	public List<Sys> getNameInfo(String name,int currentPage,int pageSize);

	
}
