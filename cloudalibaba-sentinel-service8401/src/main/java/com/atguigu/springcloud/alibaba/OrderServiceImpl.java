package com.atguigu.springcloud.alibaba;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

//上游-订单服务（如果此时下游请求压力过大，上游及时采取措施，假设上游挂了，那么下游会减少链式处理操作）
@Service
public class OrderServiceImpl implements OrderService{

    @SentinelResource(value = "getOrder") //填写上级(接口)资源名
    public String getOrder() {
        System.out.println("getOrder");
        return "getOrder-测试链路模式";
    }

}
