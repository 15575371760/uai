package com.zh_ai.service;

import com.zh_ai.entity.Comment;

import java.util.List;

public interface CommentService {
    /**
     * 评论一条
     * @param comment
     */
    public int addComment(Comment comment);

    /**
     * 删除一条评论
     * @param id
     */
    public int delComment(int id);

    /**
     * 查看一条评论
     * @return
     */
    public Comment getInfo(int id);

    /**
     * 查看当个商品的所有评论信息
     * @return
     */
    public List<Comment> getAllInfo(String gid);

    /**
     * 追加一条评论
     * @return
     */
    public int  update(Comment comment);
}
