package com.test.web.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 功能描述: <br>
 * @Author lzc
 * @Description //TODO 登录controller
 * @Date 20:09 2019/9/2
 * @Param 
 * @return 
 **/
@Controller
public class LoginController {

    //@PostMapping处理post请求
    @PostMapping(value ="/user/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Map<String,Object> map,
                        HttpSession session){
        if(!StringUtils.isEmpty(username) && "1".equals(password)){

            session.setAttribute("loginUser", username);
            //登录成功,防止重复提交,采用重定向的方式
            return "redirect:/main.html";
        }else{
            map.put("msg", "用户名密码错误");
            return "login";
        }

    }
}
