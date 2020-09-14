package com.zh_ai.service.impl;

import com.zh_ai.dao.CommentDao;
import com.zh_ai.entity.Comment;
import com.zh_ai.service.CommentService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.swing.plaf.multi.MultiMenuBarUI;
import java.util.List;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/8 8:53
 */
public class CommentServiceImpl implements CommentService {
    /**
     * �������һ��
     * @param comment
     */
    @Override
    public int addComment(Comment comment) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            CommentDao dao=session.getMapper(CommentDao.class);
            return dao.addComment(comment);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }
    /**
     * ɾ��һ������
     * @param id
     */
    @Override
    public int delComment(int id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            CommentDao dao=session.getMapper(CommentDao.class);
            return dao.delComment(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }
    /**
     * �鿴һ������
     * @return
     */
    @Override
    public Comment getInfo(int id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            CommentDao dao=session.getMapper(CommentDao.class);
            return dao.getInfo(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
    /**
     * �鿴������Ʒ������������Ϣ
     * @return
     */
    @Override
    public List<Comment> getAllInfo(String gid) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            CommentDao dao=session.getMapper(CommentDao.class);
            return dao.getAllInfo(gid);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
    /**
     * ׷��һ������
     * @return
     */
    @Override
    public int update(Comment comment) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            CommentDao dao=session.getMapper(CommentDao.class);
            return dao.update(comment);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }
}
