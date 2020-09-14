package com.zh_ai.service;

import com.zh_ai.entity.Comment;

import java.util.List;

public interface CommentService {
    /**
     * ����һ��
     * @param comment
     */
    public int addComment(Comment comment);

    /**
     * ɾ��һ������
     * @param id
     */
    public int delComment(int id);

    /**
     * �鿴һ������
     * @return
     */
    public Comment getInfo(int id);

    /**
     * �鿴������Ʒ������������Ϣ
     * @return
     */
    public List<Comment> getAllInfo(String gid);

    /**
     * ׷��һ������
     * @return
     */
    public int  update(Comment comment);
}
