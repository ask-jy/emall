package com.emall.mapper;

import com.emall.pojo.TbItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemMapper {

    int insert(TbItem tbItem);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(Long id);

    List<TbItem> selectAll();

    List<TbItem> selectByPrimaryKey(Long id);

    List<TbItem> selectItemByCondition(@Param("search") String search);
}
