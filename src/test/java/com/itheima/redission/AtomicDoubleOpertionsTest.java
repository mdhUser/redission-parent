package com.itheima.redission;

import com.itheima.redission.service.AtomicDoubleOpertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName AtomicDoubleOpertionsTest.java
 * @Description 原子浮点型操作
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AtomicDoubleOpertionsTest {

    @Autowired
    AtomicDoubleOpertions atomicDoubleOpertions;

    @Test
    public void atomicLongOperTest(){
        atomicDoubleOpertions.atomicDoubleOper();
    }
    
}
