package com.emall.mapper;

import com.emall.pojo.TbUser;

import java.util.List;

public interface TbUserMapper {

    int insert(TbUser record);

    int deleteByPrimaryKey(Long id);

    List<TbUser> selectByPrimaryKey(Long id);

    TbUser selectByUsername(String username);

    int update();
}
