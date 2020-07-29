package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//注册dao层实现
@Mapper
public interface StorageDao {

    //扣减商品库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
