package com.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
//@FeignClient(value = "CLOUD-ORDER-SERVICE")
@FeignClient(value = "cloud-order-service")
public interface ListOrderService {

    //获取10个长度的随机字符串
    @GetMapping(value = "/provider/getString")
    public String getString();

    //获取x个长度的随机字符串
    @GetMapping(value = "/provider/getChoiceString/{length}")
    public String getString(@PathVariable("length") Integer length);
}
