package com.emall.service;

import com.emall.pojo.TbUser;

//用户接口
public interface UserService {

    /**
     * 通过用户名获取用户
     * @param username 用户名
     * @return 返回用户对象
     */
    TbUser getUserByUsername(String username);


}
