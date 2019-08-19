package com.lzc.springboot_byinitializer2;

import com.lzc.springboot_byinitializer2.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 功能描述: <br>
 * @Author lzc
 * @Description //TODO spring boot的单元测试类，可以像编码一样进行自动注入，很方便
 * @Date 22:29 2019/8/19
 * @Param 
 * @return 
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootByinitializer2ApplicationTests {

    @Autowired
    private Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
