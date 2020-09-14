package com.zh_ai.service.impl;

import com.zh_ai.dao.BlackDao;
import com.zh_ai.dao.GoodsDao;
import com.zh_ai.entity.Black;
import com.zh_ai.entity.Goods;
import com.zh_ai.service.GoodsService;
import com.zh_ai.util.MyBatisUtil;
import com.zh_ai.util.Page;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/8 8:53
 */
public class GoodsServiceImpl implements GoodsService {
    /**
     * 查询所有商品信息
     * @return
     */
    @Override
    public List<Goods> getAllInfo() {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            List<Goods> goodsList = goodsDao.getAllInfo();
            return goodsList;
        }finally {
            session.close();
        }
    }
    /**
     * 按所給条件查询
     * @return
     */
    public List<Goods> getInfo(String name,int count){
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            Map map=new HashMap();
            map.put("name",name);
            map.put("count",count);
            List<Goods> goodsList = goodsDao.getInfo(map);
            return goodsList;
        }finally {
            session.close();
        }
    }
    /**
     * 向商品表中添加一条商品信息
     * @param goods
     * @return
     */
    @Override
    public int addInfo(Goods goods) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            return goodsDao.addInfo(goods);
        }finally {
            session.commit();
            session.close();
        }
    }
    /**
     * 修改单个商品信息(增加库存，销量的增长也在这里进行)
     * @param goods
     * @return
     */
    @Override
    public int setInfo(Goods goods) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            return goodsDao.setInfo(goods);
        }finally {
            session.close();
        }
    }
    /**
     * 删除选中的商品信息
     * @param id 对应的商品编号
     * @return
     */
    @Override
    public int delInfo(int id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            return goodsDao.delInfo(id);
        }finally {
            session.close();
        }
    }

    //新加的功能
    /**
     * 查询当个商品的信息
     * @param id 需要查询的商品编号
     * @return 返回商品对象
     */
    @Override
    public Goods getGoodsInfo(int id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            Goods goods = goodsDao.getGoodsInfo(id);
            return goods;
        }finally {
            session.close();
        }
    }
    /**
     * 按对应的商品类型查询商品
     * @param typeOne 一级商品类型编号
     * @param typeTwo 二级商品类型编号
     * @return 返回商品集合
     */
    @Override
    public List<Goods> getTypeGoodsInfo(int typeOne, int typeTwo) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            List<Goods> goodsList = goodsDao.getAllInfo();
            return goodsList;
        }finally {
            session.close();
        }
    }
    /**
     * 按商品名称获取对应的商品信息(模糊查询)
     * @param name
     * @return
     */
    @Override
    public List<Goods> getNameGoodsInfo(String name) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            List<Goods> goodsList = goodsDao.getNameGoodsInfo(name);
            return goodsList;
        }finally {
            session.close();
        }
    }
    /**
     * 查询销量前10的商品信息
     * @return
     */
    @Override
    public List<Goods> getDesc10() {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            List<Goods> goodsList = goodsDao.getDesc10();
            return goodsList;
        }finally {
            session.close();
        }
    }
    /**
     * 获取商品总记录数
     * @return
     */
    @Override
    public int totalCount() {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            GoodsDao goodsDao = session.getMapper(GoodsDao.class);
            return 0;
        }finally {
            session.close();
        }
    }
    /**
     * 按商品名称获取对应的商品信息(模糊查询)
     * @param name 名字
     * @param id 商品编号
     * @param currentPage 当前页码
     * @param pageSize 页面尺寸
     * @return  返回一个商品分类实体类
     */
    @Override
    public Page<Goods> getNameGoodsInfo(String name, int id, int currentPage, int pageSize) {
        return null;
    }

    @Override
    public Page<Goods> findPageGoods(int pageNum, int pageSize, Integer id, String name) {
        return null;
    }
}
