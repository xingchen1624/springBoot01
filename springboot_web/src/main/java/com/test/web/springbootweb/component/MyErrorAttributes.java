package com.test.web.springbootweb.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
    //重写getErrorAttributes方法
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        //获取springboot默认的error attributes
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        //额外添加自定义的error attributes
        map.put("company", "wdjr");
        //获取我们自己扩展的异常信息加入map中
        Map<String,Object> ext = (Map<String, Object>) webRequest.getAttribute("ext", 0);
        map.put("ext", ext);
        return map;
    }
}
