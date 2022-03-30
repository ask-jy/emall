package com.emall.service.iml;

import com.emall.mapper.TbOrderItemMapper;
import com.emall.mapper.TbOrderMapper;
import com.emall.mapper.TbShippingMapper;
import com.emall.pojo.TbItem;
import com.emall.pojo.TbOrder;
import com.emall.pojo.TbShipping;
import com.emall.pojo.TbUser;
import com.emall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    TbOrderMapper tbOrderMapper;

    @Autowired
    TbOrderItemMapper tbOrderItemMapper;

    @Autowired
    TbShippingMapper tbShippingMapper;

    /**
     * 创建订单，通过商品id和用户id创建
     * @param tbItem 商品
     * @param tbUser 用户
     * @return
     */
    @Transactional
    public boolean createOrder(TbItem tbItem, TbUser tbUser) {

        TbOrder tbOrder=new TbOrder();
        tbOrder.setUserId(tbUser.getId());
        tbOrder.setOrderId("123456");
        tbOrderMapper.insert(tbOrder);

        TbShipping tbShipping=new TbShipping();
        tbShipping.setUserId(tbUser.getId());
        tbShipping.setOrderId(tbOrder.getOrderId());
        tbShipping.setId("123456");
        tbShippingMapper.insert(tbShipping);
        return true;
    }

    public List<TbOrder> getUserOrder(TbUser tbUser) {
        return null;
    }

    public int getPayinfoStatus(TbOrder tbOrder) {
        return 0;
    }
}
