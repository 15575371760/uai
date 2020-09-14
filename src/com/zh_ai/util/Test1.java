package com.zh_ai.util;

import com.alibaba.fastjson.JSON;
import com.zh_ai.dao.BlackDao;
import com.zh_ai.dao.CommentDao;
import com.zh_ai.dao.UserDao;
import com.zh_ai.entity.Black;
import com.zh_ai.entity.Comment;
import com.zh_ai.entity.Goods;
import com.zh_ai.entity.Goods_Type;
import com.zh_ai.service.GType1Service;
import com.zh_ai.service.GoodsService;
import com.zh_ai.service.impl.GType1ServiceImpl;
import com.zh_ai.service.impl.GoodsServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/7 9:23
 */
public class Test1 {
    @Test
    public void test(){
        GoodsService dao = new GoodsServiceImpl();
        List<Goods> goods = dao.getInfo("时尚.新颖",6);
//        System.out.println(JSON.toJSONString(typeList));
        System.out.println(goods.toString());
    }
}
