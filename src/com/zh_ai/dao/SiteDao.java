package com.zh_ai.dao;

import java.util.List;

import com.zh_ai.entity.Site;

/**
 * �ջ���ַ�Ķ�Ӧ�ӿ�
 * @author ľګ����
 *
 */
public interface SiteDao {
	/**
	 * ���ջ���ַ��Ų鿴�ջ���ַ
	 * @param id
	 * @return
	 */
	public Site getSite(int id);
	/**
	 * ���û��˺Ų�ѯ�ջ���ַ
	 * @param uid
	 * @return
	 */
	public List<Site> getUidSite(String uid);
	/**
	 * ��ѯ�����ջ���ַ��Ϣ
	 * @param
	 * @return
	 */
	public List<Site> getSite();
	/**
	 * ���һ���ջ���ַ��Ϣ
	 * @param site
	 * @return
	 */
	public int addSite(Site site);
	/**
	 * �޸Ķ�Ӧ���ջ���ַ��Ϣ
	 * @param site
	 * @return
	 */
	public int setSite(Site site);
	/**
	 * ���ջ���ַ���ɾ��ѡ�е��ջ���ַ��Ϣ
	 * @param
	 * @return
	 */
	public int delSite(int id);
	
}
