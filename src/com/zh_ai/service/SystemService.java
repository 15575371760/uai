package com.zh_ai.service;

import java.util.List;

import com.zh_ai.entity.Sys;
import com.zh_ai.util.Page;

/**
 * ����Ա��Ĺ��ܽӿ�
 * @author dell
 *
 */
public interface SystemService {
	/**
	 * �鿴���й���Ա��Ϣ
	 * @return
	 */
	public Page getAllInfo(int currentPage, int pageSize);
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
	public Page getNameInfo(String name,int currentPage,int pageSize);
	/**
	 * ���˺������ѯ�Ƿ���ڷ��������Ĺ���Ա(��¼)
	 * @param id �����˺�
	 * @param pwd ��������
	 * @return
	 */
	public Sys getInfo(String id,String pwd);
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

}

