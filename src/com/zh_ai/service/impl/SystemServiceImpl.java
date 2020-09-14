package com.zh_ai.service.impl;

import com.zh_ai.dao.SystemDao;
import com.zh_ai.dao.TradeTableDao;
import com.zh_ai.entity.Sys;
import com.zh_ai.service.SystemService;
import com.zh_ai.util.MyBatisUtil;
import com.zh_ai.util.Page;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/8 8:54
 */
public class SystemServiceImpl implements SystemService {
    @Override
    public Page getAllInfo(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public int getAllCount() {
        return 0;
    }

    @Override
    public Sys getInfo(String id) {
        return null;
    }

    @Override
    public Page getNameInfo(String name, int currentPage, int pageSize) {
        return null;
    }

    @Override
    public Sys getInfo(String id, String pwd) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            SystemDao dao=session.getMapper(SystemDao.class);
            return dao.getSysInfo(id,pwd);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public List<Sys> getGradeInfo(int i) {
        return null;
    }

    @Override
    public int setPwd(String id, String pwd, String tpwd) {
        return 0;
    }

    @Override
    public int addSystem(Sys sys) {
        return 0;
    }

    @Override
    public int delSystem(Sys sys) {
        return 0;
    }
}
