package com.emall.mapper;

import com.emall.pojo.TbPayinfo;

import java.util.List;

public interface TbPayinfoMapper {

    int insert(TbPayinfo record);

    int deleteByPrimaryKey(String id);

    List<TbPayinfo> selectByPrimaryKey(String id);

    int update();
}
