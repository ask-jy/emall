package com.emall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/*
物流表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbShipping implements Serializable {

    private String id;

    /*
    订单id
     */
    private String orderId;

    /*
    用户id
     */
    private Long userId;

    private String receiverName;

    private String receiverPhone;

    private String province;

    private String city;

    private String district;

    private String address;

    private String zip;

    private Date created;

    private Date updated;
}
