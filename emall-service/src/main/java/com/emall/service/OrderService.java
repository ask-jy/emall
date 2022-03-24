package com.emall.service;

import com.emall.pojo.TbItem;
import com.emall.pojo.TbOrder;
import com.emall.pojo.TbUser;

import java.util.List;

public interface OrderService {

    /**
     * 创建订单
     * @param tbItem 商品
     * @param tbUser 用户
     * @return 判断是否创建成功
     */
    boolean createOrder(TbItem tbItem, TbUser tbUser);

    /**
     * 获取用户所有订单
     * @param tbUser 用户
     * @return 返回所有订单
     */
    List<TbOrder> getUserOrder(TbUser tbUser);


    /**
     * 获取支付状态
     * @param tbOrder 订单
     * @return 支付状态0:支付失败 1:支付成功
     */
    int getPayinfoStatus(TbOrder tbOrder);
}
