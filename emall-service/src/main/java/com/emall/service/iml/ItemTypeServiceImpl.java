package com.emall.service.iml;

import com.emall.mapper.TbItemMapper;
import com.emall.mapper.TbItemTypeMapper;
import com.emall.pojo.TbItem;
import com.emall.pojo.TbItemType;
import com.emall.service.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemTypeServiceImpl implements ItemTypeService {

    @Autowired
    TbItemTypeMapper tbItemTypeMapper;

    @Autowired
    TbItemMapper tbItemMapper;

    /**
     * 查询某商品类型下的所有商品
     * @param tbItemType 商品类型
     * @return
     */
    public List<TbItem> getAllItemByType(String tbItemType) throws Exception {

        TbItemType tbItemType1 = tbItemTypeMapper.selectByName(tbItemType);

        if(tbItemType1!=null){
            List<TbItem> tbItems = tbItemMapper.selectByItemType(tbItemType1.getId());
            return tbItems;
        }else throw new Exception("Not Found");
    }
}
