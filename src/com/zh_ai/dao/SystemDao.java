package com.zh_ai.dao;

import java.util.List;

import com.zh_ai.entity.Sys;
import org.apache.ibatis.annotations.Param;

/**
 * ����Ա��Ĺ��ܽӿ�
 * @author ľګ����
 *
 */
public interface SystemDao {
	/**
	 * �鿴���й���Ա��Ϣ
	 * @return
	 */
	public List<Sys> getAllInfo();
	/**
	 * �鿴һ��ע���˶��ٸ�����Ա
	 * @return
	 */
	public int getAllCount();
	/**
	 * �������˺Ų�ѯָ���˺���Ϣ
	 * @param id ����ѯ�Ĺ���Ա�˺�
	 * @return
	 */
	public Sys getInfo(String id);
	/**
	 * ������������ѯ����Ա��Ϣ����ģ����ѯ��
	 * @param name
	 * @return
	 */
	public List<Sys> getNameInfo(String name);
	/**
	 * ���˺������ѯ�Ƿ���ڷ��������Ĺ���Ա(��¼)
	 * @param id �����˺�
	 * @param pwd ��������
	 * @return
	 */
	public Sys getSysInfo(@Param("id") String id, @Param("pwd") String pwd);
	/**
	 * ���Ȳ�ѯ����Ա��Ϣ
	 * @param i
	 * @return
	 */
	public List<Sys> getGradeInfo(int i);
	/**
	 * �޸�ָ������Ա����
	 * @param id ��Ӧ���˺�
	 * @param pwd ԭ����
	 * @param tpwd ������
	 * @return
	 */
	public int setPwd(String id,String pwd,String tpwd);
	/**
	 * ��ӹ���Ա
	 * @param
	 * @return
	 */
	public int addSystem(Sys sys);
	/**
	 * ɾ��ָ������Ա��Ϣ
	 * @param
	 * @return
	 */
	public int delSystem(Sys sys);
	
	
	
	
	
	
	//////
	//////������ӽ���û�б���ķ���
	//////
	/**
	 * �鿴���й���Ա��Ϣ
	 * @return
	 */
	public List<Sys> getAllInfo(int currentPage,int pageSize);
	/**
	 * ������������ѯ����Ա��Ϣ����ģ����ѯ��
	 * @param name
	 * @return
	 */
	public List<Sys> getNameInfo(String name,int currentPage,int pageSize);

	
}
