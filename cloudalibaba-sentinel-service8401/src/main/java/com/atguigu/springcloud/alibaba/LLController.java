package com.atguigu.springcloud.alibaba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LLController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/test1")
    public String test1() {
        orderService.getOrder();
        return "test1";
    }

    @GetMapping("/test2")
    public String test2() {
        orderService.getOrder();
        return "test2";
    }
}
