package com.test.springboot.springbootLogging;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLoggingApplicationTests {
    //日志记录器，注意是slf4j下的
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before
    public void init(){
        System.out.println("---------------------日志测试开始---------------------");
    }

    /**
     * 功能描述: <br>
     * @Author lzc
     * @Description //TODO springboot日志级别测试
     * @Date 22:03 2019/8/22
     * @Param []
     * @return void
     *
     * springboot默认日志级别是info
     **/
    @Test
    public void contextLoads() {
        logger.trace("this is trace log");
        logger.debug("this is debug log");
        logger.info("this is info log");
        logger.warn("this is warn log");
        logger.error("this is error log");
    }

    @After
    public void after(){
        System.out.println("---------------------日志测试结束---------------------");
    }

}
