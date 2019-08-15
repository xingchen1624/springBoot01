/**
 * Copyright (C), 2012-2019, by xavier chen
 * FileName: HelloWorldMainApplication
 * Author:   chen
 * Date:     2019/8/15 21:30
 * Description: spring boot的主程序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/
package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 〈一句话功能简述〉@SpringBootApplication来标志一个springboot应用
 * 〈spring boot的主程序〉
 * @Author chen
 * @Date 2019/8/15
 * @since 1.0.0
 **/
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //启动spring应用（程序入口）
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}