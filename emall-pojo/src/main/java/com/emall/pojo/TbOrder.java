package com.emall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*
订单表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbOrder implements Serializable {

    /*
    订单id
     */
    private String orderId;

    /*
    用户id
     */
    private Long userId;

    /*
    支付方式:在线支付,货到付款
     */
    private String paymentType;

    private Date created;

    private Date updated;

    /*
    支付时间
     */
    private Date paymentTime;

    private Date endTime;

    /*
    物流id
     */
    private String shippingId;

    /*
    支付金额
     */
    private BigDecimal payment;

    private Byte status;
}
