package com.emall.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 过滤
 * 要访问该资源需要登录验证
 */
@WebFilter("/user")
public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request=(HttpServletRequest)req;
        HttpServletResponse response=(HttpServletResponse)resp;

        //获取资源请求路径
        String requestURI=request.getRequestURI();
        if(requestURI.contains("/login.jsp")){
            chain.doFilter(request,response);
        }else {
            Object user=request.getSession().getAttribute("user");
            if(user!=null)
                //登录了放行
                chain.doFilter(request,response);
            else {
                //没有登录返回登录页面
                request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            }
        }
    }

    public void destroy() {

    }
}
