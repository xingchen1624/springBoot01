/**
 * Copyright (C), 2012-2019, by xavier chen
 * FileName: MyMvcConfig
 * Author:   chen
 * Date:     2019/8/28 21:55
 * Description: springMVC的扩展配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/
package com.test.web.springbootweb.config;


import com.test.web.springbootweb.component.LoginHandlerInterceptor;
import com.test.web.springbootweb.resolver.MyLocaleResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 〈一句话功能简述〉
 * 〈springMVC的扩展配置类〉
 *
 * @Author chen
 * @Date 2019/8/28
 * @since 1.0.0
 **/
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //接收到/url请求，将请求定位到 success对应的视图页面
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    //所有的 webMvcConfigurerAdapter组件会一起起作用 springboot1.x版本使用webMvcConfigurerAdapter
    //在2.x版本中，可以直接使用
//    @Bean //注册到容器去
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
//        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("login");
//                registry.addViewController("/login.html").setViewName("login");
//            }
//        };
//        return adapter;
//    }

    //注册自定义拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //关于静态资源 css js img，SpringMVC需要在拦截器中排除静态资源。但是 springboot默认已经做好了静态资源映射
//        //‘/**’表示任意请求  excludePathPatterns：排除某些指定请求，不做拦截
//        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").
//                excludePathPatterns("/index.html","/","/user/login");
//    }

    //添加自定义的国际化resolver
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

    //springboot1.x版本使用下面的方式自定义servlet容器
//    @Bean
//    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){
//        return new EmbeddedServletContainerCustomizer() {
//            //定制嵌入式Servlet的容器相关规则
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//                container.setPort(8999);
//            }
//        };
//    }

}