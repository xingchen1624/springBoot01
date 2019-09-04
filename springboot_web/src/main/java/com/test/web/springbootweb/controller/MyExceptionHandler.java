package com.test.web.springbootweb.controller;

import com.test.web.springbootweb.exception.UserNotExitsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 全局controller异常处理器
 */
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 功能描述: <br>
     * @Author lzc
     * @Description //TODO
     * 使用这种方式，不同的客户端返回的都是我们自定义的json
     * 无法区分是浏览器还是其它客户端发送的请求，采用的都是同一种处理方式
     * @Date 19:42 2019/9/4
     * @Param [e]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
//    @ResponseBody
//    @ExceptionHandler(UserNotExitsException.class)
//    public Map<String ,Object> handlerException(Exception e){
//        Map<String ,Object> map =new HashMap<>();
//        map.put("code", "user not exist");
//        map.put("message", e.getMessage());
//        return map;
//    }

    @ExceptionHandler(UserNotExitsException.class)
    public String handlerException(Exception e, HttpServletRequest request){
        Map<String ,Object> map =new HashMap<>();
        //传入自己的错误状态码，我们在BasicErrorController类中可以看到
        //该类是从 request中取javax.servlet.error.status_code属性
        request.setAttribute("javax.servlet.error.status_code", 432);
        map.put("code", "user not exist");
        map.put("message", e.getMessage());
        //将我们扩展的返回信息放到request中
        request.setAttribute("ext", map);
        //转发到 /error  BasicErrorController会处理这个请求
        return "forward:/error";
    }
}
