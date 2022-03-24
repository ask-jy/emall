package com.emall.service.iml;

import com.emall.mapper.TbUserMapper;
import com.emall.pojo.TbUser;
import com.emall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TbUserMapper tbUserMapper;
    /*
    通过用户名获取用户
     */
    public TbUser getUserByUsername(String username) {
       return  tbUserMapper.selectByUsername(username);
    }
}
