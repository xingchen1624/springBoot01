/**
 * Copyright (C), 2012-2019, by xavier chen
 * FileName: MyConfig
 * Author:   chen
 * Date:     2019/8/20 20:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/
package com.lzc.springboot_byinitializer2.config;

import com.lzc.springboot_byinitializer2.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉
 * 〈springboot配置类〉
 * @Author chen
 * @Date 2019/8/20
 * @since 1.0.0
 *
 * @Configuration指定当前类是一个配置类，用来替代spring以前的配置文件
 **/
@Configuration
public class MyConfig {
    //将方法的返回值添加到容器中；容器这个组件id就是方法名,比如这里就是注册了bean:helloService01
    @Bean
    public HelloService helloService(){
        System.out.println("配置类给容器添加了HelloService组件");
        return new HelloService();
    }
}