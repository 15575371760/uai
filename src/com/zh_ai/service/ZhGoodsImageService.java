package com.zh_ai.service;

import com.zh_ai.entity.ZhGoodsImage;

import java.util.List;

public interface ZhGoodsImageService {
    public int addInfo(ZhGoodsImage goodsImg);

    public List<ZhGoodsImage> getAll();

    public List<ZhGoodsImage> getInfoByGid(int id);
}
