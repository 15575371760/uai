package com.zh_ai.service;

import com.zh_ai.entity.Black;

import java.util.List;

public interface BlackService {
    /**
     * ��ѯ�������ڵ�������Ϣ
     * @return
     */

    public List<Black> getAllBlack();
    /**
     * ���û��˺Ų����Ƿ���ڱ������û�
     * @param uid
     * @return
     */
    public Black getUid(String uid);
    /**
     * �������Χ�ڵ�ʱ���ѯ��������û�
     * @param initialDate ��ʼʱ��
     * @param date ��ֹʱ��
     * @return
     */
    public List<Black> getDateInfo(String initialDate,String date);
    /**
     * ������ֱ��ɾ��
     * @param uid
     * @return
     */
    public int delDateInfo(String uid);
    /**
     * �޸ķ��ʱ��
     * @return
     */
    public int setDateInfo(Black black);

    /**
     * ������������һ�����ݣ������һ���û���ʹ��Ȩ�ޣ�
     * @param black
     * @return
     */
    public int insert(Black black);
}
