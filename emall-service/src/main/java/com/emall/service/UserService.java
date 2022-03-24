package com.emall.service;

import com.emall.pojo.TbUser;

//用户接口
public interface UserService {

    /*
    通过用户名获取用户
     */
    TbUser getUserByUsername(String username);


}
