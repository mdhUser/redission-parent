package com.itheima.redission;

import com.itheima.redission.pojo.AnyObject;
import com.itheima.redission.service.RMapOpertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName RMapOpertionsTest.java
 * @Description hash表操作
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RMapOpertionsTest {

    @Autowired
    RMapOpertions rMapOpertions;

    @Test
    public void rMapOperTest(){
        rMapOpertions.rMapOper();
    }
}
