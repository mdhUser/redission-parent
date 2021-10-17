package com.itheima.redission;

import com.itheima.redission.service.RMapCacheOpertions;
import com.itheima.redission.service.RMapOpertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName RMapCacheOpertionsTest.java
 * @Description TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RMapCacheOpertionsTest {

    @Autowired
    RMapCacheOpertions rMapCacheOpertions;

    @Test
    public void rMapOperTest(){
        rMapCacheOpertions.rMapCache();
    }
}
