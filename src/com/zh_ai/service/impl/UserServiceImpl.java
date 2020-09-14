package com.zh_ai.service.impl;

import com.zh_ai.dao.TradeTableDao;
import com.zh_ai.dao.UserDao;
import com.zh_ai.entity.User;
import com.zh_ai.service.UserService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/8 8:55
 */
public class UserServiceImpl implements UserService {

    @Override
    public int addUser(User user) {
        int num=0;
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            UserDao dao=session.getMapper(UserDao.class);

            num= dao.addUser(user);
            session.commit();
            return num;
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }

        return num;
    }

    @Override
    public User getUserId(String id, String pwd) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            UserDao dao=session.getMapper(UserDao.class);
            return dao.getUserId(id,pwd);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public User getUserInfo(String id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            UserDao dao=session.getMapper(UserDao.class);
            return dao.getUserInfo(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public int setUserInfo(User user) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            UserDao dao=session.getMapper(UserDao.class);
            return dao.setUserInfo(user);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return 0;
    }

    @Override
    public int setUserPwd(String id, String pwd, String tPwd) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            UserDao dao=session.getMapper(UserDao.class);
            return dao.setUserPwd(id,pwd,tPwd);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return 0;
    }

    @Override
    public int addUserIdNo(String id, String pwd, String idNo) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            UserDao dao=session.getMapper(UserDao.class);
            return dao.addUserIdNo(id,pwd,idNo);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return 0;
    }

    @Override
    public List<String> getAllUserid() {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            UserDao dao=session.getMapper(UserDao.class);
            return dao.getAllUserid();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }

        return null;
    }

    @Override
    public List<User> getAllInfo() {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            UserDao dao=session.getMapper(UserDao.class);
            return dao.getAllInfo();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }
}
