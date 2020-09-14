package com.zh_ai.service;

import com.zh_ai.entity.Black;

import java.util.List;

public interface BlackService {
    /**
     * 查询黑名单内的所有信息
     * @return
     */

    public List<Black> getAllBlack();
    /**
     * 按用户账号查找是否存在被禁掉用户
     * @param uid
     * @return
     */
    public Black getUid(String uid);
    /**
     * 按封禁范围内的时间查询被封禁的用户
     * @param initialDate 开始时间
     * @param date 截止时间
     * @return
     */
    public List<Black> getDateInfo(String initialDate,String date);
    /**
     * 误封禁，直接删除
     * @param uid
     * @return
     */
    public int delDateInfo(String uid);
    /**
     * 修改封禁时间
     * @return
     */
    public int setDateInfo(Black black);

    /**
     * 向黑名单表添加一条数据（即封禁一个用户的使用权限）
     * @param black
     * @return
     */
    public int insert(Black black);
}
