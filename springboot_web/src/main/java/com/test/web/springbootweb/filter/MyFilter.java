package com.test.web.springbootweb.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 功能描述: <br>
 * @Author lzc
 * @Description //TODO 自定义的filter
 * @Date 21:34 2019/9/4
 * @Param 
 * @return 
 **/
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter process");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
