package com.emall.service.iml;

import com.emall.mapper.TbItemMapper;
import com.emall.pojo.TbItem;
import com.emall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    TbItemMapper tbItemMapper;

    public List<TbItem> getItemByName(String name) {
        String condition='%'+name+'%';
        return tbItemMapper.selectItemByCondition(condition);
    }
}
