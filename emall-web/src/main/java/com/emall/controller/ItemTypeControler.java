package com.emall.controller;


import com.emall.pojo.TbItem;
import com.emall.service.ItemTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ItemTypeControler {

    @Autowired
    ItemTypeService itemTypeService;

    @RequestMapping("/itemtype/{tbItemType}")
    public String getAllItemByType(@PathVariable("tbItemType") String tbItemType, Model model)  {

        String res="";
        List<TbItem> allItemByType = null;
        try {
            allItemByType = itemTypeService.getAllItemByType(tbItemType);

            for (TbItem tbItem : allItemByType) {
                res+=tbItem.toString()+"\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (res.equals("")){
                model.addAttribute("msg","Not Found");
            }else
            model.addAttribute("msg",res);
        }
        return "hello";
    }
}
