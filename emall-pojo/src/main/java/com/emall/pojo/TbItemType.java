package com.emall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/*
商品类型表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbItemType implements Serializable {

    private Long id;

    /*
    父类型
     */
    private Long parentID;

    private String name;

    private Byte status;

    private Date created;

    private Date updated;
}
