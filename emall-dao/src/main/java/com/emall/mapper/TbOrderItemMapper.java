package com.emall.mapper;

import com.emall.pojo.TbOrderItem;

import java.util.List;

public interface TbOrderItemMapper {

    int insert(TbOrderItem record);

    int deleteByPrimaryKey(String id);

    List<TbOrderItem> selectByPrimaryKey(String id);

    int update();
}
