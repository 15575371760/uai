package com.zh_ai.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 进行增强处理的过滤器，设置字符集
 */
@WebFilter("/*")
public class CharsetFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest)req;
        HttpServletResponse httpResponse = (HttpServletResponse)resp;
        httpRequest.setCharacterEncoding("utf-8");
        httpResponse.setContentType("text/html;charset=utf-8");
        httpResponse.setCharacterEncoding("utf-8");
        chain.doFilter(httpRequest, httpResponse);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
