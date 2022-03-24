package com.emall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*
支付信息表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbPayinfo implements Serializable {

    private String id;

    /*
    用户id
     */
    private Long userId;

    /*
    订单id
     */
    private String orderId;

    /*
    支付金额
     */
    private BigDecimal payment;

    /*
    支付方式
     */
    private Integer paymentType;

    private Byte status;

    private Date created;

    private Date updated;
}
