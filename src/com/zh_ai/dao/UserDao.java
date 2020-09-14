package com.zh_ai.dao;

import java.util.List;
import java.util.Map;

import com.zh_ai.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户类接口
 * @author 木讷呆神
 *
 */
public interface UserDao {
	/**
	 * 注册一个用户
	 * @param user 
	 * @return
	 */
	public int addUser(User user);
	/**
	 * 查询单个用户（登录）
	 * @return
	 */
	public User getUserId(@Param("id")String id, @Param("pwd")String pwd);
	/**
	 * 按账号查询用户信息
	 * @param id 要查询的用户账号
	 * @return
	 */
	public User getUserInfo(String id);
	/**
	 * 更新一个用户的信息资料
	 * @param user
	 * @return
	 */
	public int setUserInfo(User user);
	/**
	 * 更新密（修改密码）
	 * @param id 用户账号
	 * @param pwd 原密码
	 * @param tPwd 修改的密码
	 * @return 返回受影响行数
	 */
	public int setUserPwd(String id,String pwd,String tPwd);
	
	/**
	 * 修改用户的证件号
	 * @param id
	 * @param pwd
	 * @return
	 */
	public int addUserIdNo(String id,String pwd,String idNo);
	/**
	 * 获取所有用户账号
	 * @return
	 */
	public List<String> getAllUserid();
	/**
	 * 获取所有用户信息并存入list集合中
	 * @return
	 */
	public List<User> getAllInfo();
}
