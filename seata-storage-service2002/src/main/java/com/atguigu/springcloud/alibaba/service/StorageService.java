package com.atguigu.springcloud.alibaba.service;


public interface StorageService {
    /**
     * 扣减商品库存
     */
    void decrease(Long productId, Integer count);
}
