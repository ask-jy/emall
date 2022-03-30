package com.emall.mapper;

import com.emall.pojo.TbItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemMapper {

    int insert(TbItem tbItem);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(Long id);

    List<TbItem> selectAll();

    TbItem selectByPrimaryKey(Long id);

    List<TbItem> selectByItemType(Long itemType);

    List<TbItem> selectItemByCondition(@Param("search") String search);
}
