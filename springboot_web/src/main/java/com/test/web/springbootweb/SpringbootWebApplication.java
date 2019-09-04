package com.test.web.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }

    /**
     * 功能描述: <br>
     * @Author lzc
     * @Description
     * 将自定义ViewResolver注册为bean,看ContentNegotiatingViewResolver
     * 是否会自动帮我们的ViewResolver整合起来,
     * @Date 20:07 2019/8/28
     * @Param
     * @return
     **/
    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    /**
     * 功能描述: <br>
     * @Author lzc
     * @Description 自定义ViewResolver
     * @Date 20:12 2019/8/28
     * @Param
     * @return
     **/
    public static class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }

}
