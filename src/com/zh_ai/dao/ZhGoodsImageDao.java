package com.zh_ai.dao;

import com.zh_ai.entity.ZhGoodsImage;

import java.util.List;

public interface ZhGoodsImageDao {
    public int addInfo(ZhGoodsImage goodImg);

    public List<ZhGoodsImage> getAll();

    public List<ZhGoodsImage> getInfoByGid(int id);
}
