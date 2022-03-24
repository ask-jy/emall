package com.emall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/*
商品表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbItem implements Serializable {

    /*
    商品id
     */
    private Long id;

    private String name;

    /*
    商品类型,商品类型id
     */
    private Long itemType;

    private BigDecimal price;

    private Integer num;

    private Byte status;

    private Date created;

    private Date updated;

}
