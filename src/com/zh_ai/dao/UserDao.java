package com.zh_ai.dao;

import java.util.List;
import java.util.Map;

import com.zh_ai.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * �û���ӿ�
 * @author ľګ����
 *
 */
public interface UserDao {
	/**
	 * ע��һ���û�
	 * @param user 
	 * @return
	 */
	public int addUser(User user);
	/**
	 * ��ѯ�����û�����¼��
	 * @return
	 */
	public User getUserId(@Param("id")String id, @Param("pwd")String pwd);
	/**
	 * ���˺Ų�ѯ�û���Ϣ
	 * @param id Ҫ��ѯ���û��˺�
	 * @return
	 */
	public User getUserInfo(String id);
	/**
	 * ����һ���û�����Ϣ����
	 * @param user
	 * @return
	 */
	public int setUserInfo(User user);
	/**
	 * �����ܣ��޸����룩
	 * @param id �û��˺�
	 * @param pwd ԭ����
	 * @param tPwd �޸ĵ�����
	 * @return ������Ӱ������
	 */
	public int setUserPwd(String id,String pwd,String tPwd);
	
	/**
	 * �޸��û���֤����
	 * @param id
	 * @param pwd
	 * @return
	 */
	public int addUserIdNo(String id,String pwd,String idNo);
	/**
	 * ��ȡ�����û��˺�
	 * @return
	 */
	public List<String> getAllUserid();
	/**
	 * ��ȡ�����û���Ϣ������list������
	 * @return
	 */
	public List<User> getAllInfo();
}
