/**
 * Copyright (C), 2012-2019, by xavier chen
 * FileName: HelloSpringBoot
 * Author:   chen
 * Date:     2019/8/19 21:35
 * Description: 使用Spring Initializer创建spring boot项目
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/
package com.lzc.springboot_byinitializer2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉
 * 〈使用Spring Initializer创建spring boot项目〉
 * @Author chen
 * @Date 2019/8/19
 * @since 1.0.0
 **/
@RestController
public class HelloSpringBoot {

    @RequestMapping("/helloboot2")
    public String helloSpringBoot() {
        return "hello springboot initializer2!";
    }
}