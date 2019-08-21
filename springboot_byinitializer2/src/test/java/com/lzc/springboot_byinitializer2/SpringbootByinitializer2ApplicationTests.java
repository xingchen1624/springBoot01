package com.lzc.springboot_byinitializer2;

import com.lzc.springboot_byinitializer2.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
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

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    /**
     * 功能描述: <br>
     * @Author lzc
     * @Description //TODO 测试applicationContext中是否有helloService这个bean
     * @Date 20:43 2019/8/20
     * @Param []
     * @return void
     *
     * helloService这个bean我们配置在了我们自己写的beans.xml中，然后测试发现没有这个service
     * 这是因为我们自己写的配置文件没有生效。可以在主类上使用@ImportResource注解指定配置文件位置
     * @ImportResource(locations = {"classpath:beans.xml"})
     * 但是在实际开发中这种方式也很麻烦，写一个配置一次。springboot推荐的方式是使用全注解方式
     **/
    @Test
    public void testHelloService(){
        boolean helloService = applicationContext.containsBean("helloService");
        System.out.println("did applicationContext had the service called helloService? " + helloService);
    }

}
