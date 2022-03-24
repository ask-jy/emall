package com.emall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/*
商品订单表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbOrderItem {

    private String id;

    /*
    商品id
     */
    private Long itemId;

    /*
    订单id
     */
    private String orderId;

    /*
    商品数量
     */
    private Integer num;

    /*
    商品名
     */
    private String itemName;

    /*
    总金额
     */
    private BigDecimal totalFee;
}
