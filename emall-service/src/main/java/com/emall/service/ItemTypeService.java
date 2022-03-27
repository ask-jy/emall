package com.emall.service;

import com.emall.pojo.TbItem;
import com.emall.pojo.TbItemType;

import java.util.List;

public interface ItemTypeService {



    /**
     * 根据商品类型获取所有的商品
     * @param tbItemType 商品类型
     * @return 返回所有商品
     */
    List<TbItem> getAllItemByType(String tbItemType) throws Exception;
}
