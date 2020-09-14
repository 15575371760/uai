package com.zh_ai.service.impl;

import com.zh_ai.dao.SiteDao;
import com.zh_ai.entity.Site;
import com.zh_ai.service.SiteService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * �ջ��ַҵ���߼��㹦�ܽӿ�ʵ����
 * @author ľګ����
 *
 */
public class SiteServiceImpl implements SiteService {
    /**
     * ���ջ���ַ��Ų鿴�ջ���ַ
     * @param id
     * @return
     */
    @Override
    public Site getSite(int id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            SiteDao dao=session.getMapper(SiteDao.class);
            return  dao.getSite(id);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //�ر�session����
            session.close();
        }
        return null;
    }
    /**
     * ���û��˺Ų�ѯ�ջ���ַ
     * @param uid
     * @return
     */
    @Override
    public List<Site> getUidSite(String uid) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            SiteDao dao = session.getMapper(SiteDao.class);
            return dao.getUidSite(uid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //�ر�session����
            session.close();
        }
        return null;
    }

    /**
     * ���һ���ջ���ַ��Ϣ
     * @param site
     * @return
     */
    @Override
    public int addSite(Site site) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            SiteDao dao=session.getMapper(SiteDao.class);
            session.commit();
            return  dao.addSite(site);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //�ر�session����
            session.close();
        }
        return 0;
    }
    /**
     * �޸Ķ�Ӧ���ջ���ַ��Ϣ
     * @param site
     * @return
     */
    @Override
    public int setSite(Site site) {
        int num=0;
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            SiteDao dao=session.getMapper(SiteDao.class);
            num=  dao.setSite(site) ;
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //�ر�session����
            session.close();
        }
        return num;
    }
    /**
     * ���ջ���ַ���ɾ��ѡ�е��ջ���ַ��Ϣ
     * @param id
     * @return
     */
    @Override
    public int delSite(int id) {
        int num=0;
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            SiteDao dao=session.getMapper(SiteDao.class);
            num=  dao.delSite(id);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //�ر�session����
            session.close();
        }
        return num;
    }
}
