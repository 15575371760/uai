package com.zh_ai.service.impl;

import com.zh_ai.dao.UserDao;
import com.zh_ai.dao.ZhGoodsImageDao;
import com.zh_ai.entity.ZhGoodsImage;
import com.zh_ai.service.ZhGoodsImageService;
import com.zh_ai.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/8 8:55
 */
public class ZhGoodsImageServiceImpl implements ZhGoodsImageService {
    @Override
    public int addInfo(ZhGoodsImage goodImg) {
        SqlSession session = MyBatisUtil.getSqlSession();
        try{
            ZhGoodsImageDao dao=session.getMapper(ZhGoodsImageDao.class);
            return  dao.addInfo(goodImg);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.commit();
            session.close();
        }
        return 0;
    }

    @Override
    public List<ZhGoodsImage> getAll() {
        return null;
    }

    @Override
    public List<ZhGoodsImage> getInfoByGid(int id) {
        return null;
    }
}
