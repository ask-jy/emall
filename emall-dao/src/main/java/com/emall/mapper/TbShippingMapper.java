package com.emall.mapper;

import com.emall.pojo.TbShipping;

import java.util.List;

public interface TbShippingMapper {

    int insert(TbShipping record);

    int deleteByPrimaryKey(String id);

    List<TbShipping> selectByPrimaryKey(String id);

    int update();
}
