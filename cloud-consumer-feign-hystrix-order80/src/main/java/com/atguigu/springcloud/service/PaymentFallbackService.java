package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @project cloud2020
 * @create 2022 10 14 14:41
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "OK!☺";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "发生问题，降级处理！o(╥﹏╥)o";
    }
}
