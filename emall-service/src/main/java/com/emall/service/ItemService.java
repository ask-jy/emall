package com.emall.service;

import com.emall.pojo.TbItem;

import java.util.List;

public interface ItemService {



    /**
     * 通过商品名获取所有商品(模糊查询)
     * @param name 商品名
     * @return 返回匹配的商品
     */
    List<TbItem> getItemByName(String name);
}
