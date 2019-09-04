/**
 * Copyright (C), 2012-2019, by xavier chen
 * FileName: HelloController
 * Author:   chen
 * Date:     2019/8/26 19:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/
package com.test.web.springbootweb.controller;

import com.test.web.springbootweb.exception.UserNotExitsException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * 〈一句话功能简述〉
 * 〈测试thymeleaf的使用〉
 * @Author chen
 * @Date 2019/8/26
 * @since 1.0.0
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello springboot web module!";
    }

    @RequestMapping("/exception")
    @ResponseBody
    public String exception(@RequestParam("user") String user){
        if ("a".equals(user)) {
            throw new UserNotExitsException();
        }else {
            return "no exception";
        }
    }

    //查出一些数据在页面展示
    @RequestMapping("success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好！</h1>");
        map.put("users", Arrays.asList("张三", "lily", "龙泉"));
        map.put("id", "myId");
        map.put("class", "myClass");

        return "success";
    }

    /**
     * 功能描述: <br>
     * @Author lzc
     * @Description
     * springboot / 默认情况下访问静态资源文件夹下的index.html,如果想改变该请求方式
     * 比如默认情况下跳转到登录页面，可以采用该方法（加一个跳转首页的方法，不推荐），可以
     * 采用在配置类中扩展SpringMVC配置的方式添加自定义映射关系
     * @Date 19:51 2019/8/29
     * @Param []
     * @return java.lang.String
     **/
//    @RequestMapping({"/","login.html"})
//    public String index(){
//        return "login";
//    }
}