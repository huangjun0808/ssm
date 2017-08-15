package com.weshine.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    /**
     * Handler执行之前调用这个方法
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        StringBuffer url = request.getRequestURL();
        String url1 = request.getAuthType();
        String url2 = request.getMethod();
        String url3 = request.getPathInfo();
        String url4 = request.getQueryString();
        String url43 = request.getContextPath();
        String url45 = request.getRemoteUser();
        String url46 = request.getRequestedSessionId();
        String url463 = request.getServletPath();
        String url464 = request.getRemoteAddr();
        String url465 = request.getRemoteHost();
        return true;
    }

    /**
     * Handler执行之后，ModelAndView返回之前调用这个方法
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * Handler执行完成之后调用这个方法
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) throws Exception {

    }
}
