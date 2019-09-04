package com.test.web.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 功能描述: <br>
 * @Author lzc
 * @Description //TODO 自定义listener
 * @Date 21:51 2019/9/4
 * @Param 
 * @return 
 **/
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(".........web应用启动..........");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println(".........web应用销毁..........");
    }
}
