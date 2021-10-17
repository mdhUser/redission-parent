package com.itheima.redission;

import com.itheima.redission.pojo.AnyObject;
import com.itheima.redission.service.BucketOpertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RBucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName BucketOpertionsTest.java
 * @Description 通用对象桶测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BucketOpertionsTest {

    @Autowired
    BucketOpertions bucketOpertions;

    @Test
    public void bucketOperTest(){
        bucketOpertions.bucketOper();
    }

    @Test
    public void bucketsOperTest(){
        bucketOpertions.bucketsOper();
    }

}
