package com.zh_ai.service.impl;

import com.zh_ai.dao.TradeTableDao;
import com.zh_ai.entity.TradeTable;
import com.zh_ai.service.TradeTableService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 购物车业务逻辑层功能接口实现类
 * @author 木讷呆神
 *
 */
public class TradeTableServiceImpl implements TradeTableService {
    /**
     * 查询登录用户本身的购物车信息
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
     * 查看当个商品被加入购物车的次数
     * @return 返回有多少条相対应的数据条
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
     * 查询购物车表的信息行数
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
