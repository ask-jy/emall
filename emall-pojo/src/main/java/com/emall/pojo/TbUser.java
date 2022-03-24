package com.emall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/*
用户表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbUser implements Serializable {

    private Long id;

    /*
    用户名(不能为空)
     */
    private String username;

    /*
    密码(不能为空)
     */
    private String password;

    private String phone;

    private String email;

    private String sex;

    private Byte status;

    private Date created;

    private Date updated;
}
