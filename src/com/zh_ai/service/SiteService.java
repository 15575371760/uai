package com.zh_ai.service;

import java.util.List;

import com.zh_ai.entity.Site;

/**
 * �ջ��ַҵ���߼��㹦�ܽӿ�
 * @author ľګ����
 *
 */
public interface SiteService {
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
	 * @param site
	 * @return
	 */
	public int delSite(int id);
}
