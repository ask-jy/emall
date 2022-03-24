package com.emall.mapper;

import com.emall.pojo.TbOrder;

import java.util.List;

public interface TbOrderMapper {

    int insert(TbOrder record);

    int deleteByPrimaryKey(String orderID);

    List<TbOrder> selectByPrimaryKey(String orderID);

    int update();
}
