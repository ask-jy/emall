package com.emall.controller;

import com.emall.pojo.TbItem;
import com.emall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping("/item/{name}")
    String getItemByCondition(@PathVariable("name") String name, Model model){
        List<TbItem> item = itemService.getItemByName(name);
        if (item.isEmpty())
            model.addAttribute("msg","notfound");
        else {
            String res="";
            for (TbItem tbItem : item) {
                res=res+tbItem.toString()+"\n";
            }
            model.addAttribute("msg",res);
        }
        return "hello";
    }
}
