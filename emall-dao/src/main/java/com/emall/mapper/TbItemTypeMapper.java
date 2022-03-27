package com.emall.mapper;

import com.emall.pojo.TbItemType;

import java.util.List;

public interface TbItemTypeMapper {

     int insert(TbItemType record);

     int deleteByPrimaryKey(Long primaryKey);

     int updateByPrimaryKey(TbItemType record);

     TbItemType selectByName(String name);

     List<TbItemType> selectByPrimaryKey(int i);

     List<TbItemType> selectByParentID(Long parentID);
}
