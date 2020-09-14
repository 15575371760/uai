package com.zh_ai.service.impl;

import com.zh_ai.dao.SiteDao;
import com.zh_ai.entity.Site;
import com.zh_ai.service.SiteService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 收获地址业务逻辑层功能接口实现类
 * @author 木讷呆神
 *
 */
public class SiteServiceImpl implements SiteService {
    /**
     * 按收货地址编号查看收货地址
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
            //关闭session对象
            session.close();
        }
        return null;
    }
    /**
     * 按用户账号查询收货地址
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
            //关闭session对象
            session.close();
        }
        return null;
    }

    /**
     * 添加一条收货地址信息
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
            //关闭session对象
            session.close();
        }
        return 0;
    }
    /**
     * 修改对应的收货地址信息
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
            //关闭session对象
            session.close();
        }
        return num;
    }
    /**
     * 按收货地址编号删除选中的收货地址信息
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
            //关闭session对象
            session.close();
        }
        return num;
    }
}
