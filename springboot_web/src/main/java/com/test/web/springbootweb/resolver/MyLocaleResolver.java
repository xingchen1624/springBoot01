/**
 * Copyright (C), 2012-2019, by xavier chen
 * FileName: MyLocaleResolver
 * Author:   chen
 * Date:     2019/8/29 22:36
 * Description: 自定义国际化区域对象解析器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/
package com.test.web.springbootweb.resolver;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 〈一句话功能简述〉
 * 〈自定义国际化区域对象解析器〉
 * @Author chen
 * @Date 2019/8/29
 * @since 1.0.0
 **/
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("lg");
        Locale locale = Locale.getDefault();
        if(!StringUtils.isEmpty(l)){
            String[] split = l.split("_");
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}