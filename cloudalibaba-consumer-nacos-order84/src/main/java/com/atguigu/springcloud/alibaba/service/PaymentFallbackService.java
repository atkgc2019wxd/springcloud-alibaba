package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * 兜底处理逻辑
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
