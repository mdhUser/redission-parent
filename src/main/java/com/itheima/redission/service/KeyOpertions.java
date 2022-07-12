package com.itheima.redission.service;

import com.itheima.redission.pojo.AnyObject;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBucket;
import org.redisson.api.RKeys;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName KeyOpertions.java
 * @Description 关于key的操作
 */
@Slf4j
@Component
public class KeyOpertions {

    @Autowired
    RedissonClient redissonClient;

    public void  foundedKeys(){
        //获得Bucket
        RBucket<AnyObject> anyObjectRBucket = redissonClient.getBucket("security:zhangsan");
        //放入一个元素
        AnyObject anyObject = AnyObject.builder()
                .name("张三")
                .age(19)
                .address("中国上海")
                .build();
        //为BucketOperTest添加元素到redis中
        anyObjectRBucket.set(anyObject);
        //获得Bucket
        RBucket<AnyObject> anyObjectRBucketB = redissonClient.getBucket("login:zhangsan");
        //放入一个元素
        AnyObject anyObjectB = AnyObject.builder()
                .name("张三")
                .age(19)
                .address("中国上海")
                .build();
        //为BucketOperTest添加元素到redis中
        anyObjectRBucketB.set(anyObjectB);

        //获得所有keys
        RKeys keys = redissonClient.getKeys();
        Iterable<String> keysAll = keys.getKeys();
        keys.delete("login:zhangsan");
        for (String key : keysAll) {
            log.info("获得key:"+key);
        }

        //获得所有security开头的key
        Iterable<String> redisKeys = keys.getKeysByPattern("security*");
        for (String key : redisKeys) {
            log.info("获得key:"+key);
        }
    }

    public void deleteKeys(){
        //获得所有keys
        RKeys keys = redissonClient.getKeys();
        long flag = keys.delete("security:zhangsan");
        log.info("批量删除key:testA,testB:{}",flag);
        flag = keys.deleteByPattern("test*");
        log.info("模糊删除key:testA,testB:{}",flag);
    }

}
