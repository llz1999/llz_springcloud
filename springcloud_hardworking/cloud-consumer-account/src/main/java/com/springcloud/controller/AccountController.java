package com.springcloud.controller;

import com.springcloud.service.ListOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/consumer")
public class AccountController {
    @Autowired
    private ListOrderService listOrderService = null;

    //获取10个长度的随机字符串
    @GetMapping(value = "/getString")
    public String string(){
        return listOrderService.getString();
    }

    //获取x个长度的随机字符串
    @GetMapping(value = "/getChoiceString/{length}")
    public String string(@PathVariable("length") Integer length){
        return listOrderService.getString(length);
    }


}
