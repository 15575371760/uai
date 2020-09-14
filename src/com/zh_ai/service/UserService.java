package com.zh_ai.service;

import java.util.List;

import com.zh_ai.entity.User;
/**
 * �û��������ҵ���߼����ܽӿ�
 * @author ľګ����
 *
 */
public interface UserService {
	/**
	 * ע��һ���û�
	 * @param user 
	 * @return
	 */
	public int addUser(User user);
	/**
	 * ��ѯ�����û�����¼��
	 * @param id �û��˺�
	 * @param pwd �û�����
	 * @return
	 */
	public User getUserId(String id,String pwd);
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
	 * @param tpwd �޸ĵ�����
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
