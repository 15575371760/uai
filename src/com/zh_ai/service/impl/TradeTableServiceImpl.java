package com.zh_ai.service.impl;

import com.zh_ai.dao.TradeTableDao;
import com.zh_ai.entity.TradeTable;
import com.zh_ai.service.TradeTableService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * ���ﳵҵ���߼��㹦�ܽӿ�ʵ����
 * @author ľګ����
 *
 */
public class TradeTableServiceImpl implements TradeTableService {
    /**
     * ��ѯ��¼�û�����Ĺ��ﳵ��Ϣ
     * @param uid
     * @return
     */
    @Override
    public List<TradeTable> getTradeTableInfo(String uid) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            TradeTableDao dao=session.getMapper(TradeTableDao.class);
            return dao.getTradeTableInfo(uid);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }
    /**
     * �鿴������Ʒ�����빺�ﳵ�Ĵ���
     * @return �����ж���������Ӧ��������
     */
    @Override
    public int getGoodsTradeTable(int tid) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            TradeTableDao dao=session.getMapper(TradeTableDao.class);
            return dao.getGoodsTradeTable(tid);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return 0;
    }
    /**
     * ��ѯ���ﳵ�����Ϣ����
     * @return
     */
    @Override
    public int getTradeNumBer() {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            TradeTableDao dao=session.getMapper(TradeTableDao.class);
            return dao.getTradeNumBer();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return 0;
    }
}
