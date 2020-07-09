package com.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(value = "/provider")
public class ListOrderController {

    //获取10个长度的随机字符串
    @GetMapping(value = "/getString")
    public String getString(){
        //String randomutils = RandomStringUtils.random(5);

        String str="abcdefgfigklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb=new StringBuffer();

        for(Integer i=0; i<10; ++i){
            //产生0-61的数字
            int number=random.nextInt(61);
            //将数字添加到字符串中
            sb.append(str.charAt(number));
        }

        return sb.toString();
    }

    //获取x个长度的随机字符串
    @GetMapping(value = "/getChoiceString/{length}")
    public String getString(@PathVariable("length") Integer length){
        //String randomutils = RandomStringUtils.random(5);

        String str="abcdefgfigklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb=new StringBuffer();

        for(Integer i=0; i<length; ++i){
            //产生0-61的数字
            int number=random.nextInt(61);
            //将数字添加到字符串中
            sb.append(str.charAt(number));
        }

        return sb.toString();
    }
}
