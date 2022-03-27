package com.emall.service.iml;

import com.emall.mapper.TbOrderItemMapper;
import com.emall.mapper.TbOrderMapper;
import com.emall.pojo.TbItem;
import com.emall.pojo.TbOrder;
import com.emall.pojo.TbUser;
import com.emall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    TbOrderMapper tbOrderMapper;

    @Autowired
    TbOrderItemMapper tbOrderItemMapper;

    /**
     * 创建订单，通过商品id和用户id创建
     * @param tbItem 商品
     * @param tbUser 用户
     * @return
     */
    public boolean createOrder(TbItem tbItem, TbUser tbUser) {
        tbOrderMapper.insert(new TbOrder());
        return false;
    }

    public List<TbOrder> getUserOrder(TbUser tbUser) {
        return null;
    }

    public int getPayinfoStatus(TbOrder tbOrder) {
        return 0;
    }
}
