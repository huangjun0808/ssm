package com.weshine.dispatcher;

import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 类@
 * 自定义分发器
 * @author huangjun
 * &date 2017/11/1
 */
public class DefaultDispatcherServlet extends DispatcherServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected ModelAndView processHandlerException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if (ex instanceof HttpRequestMethodNotSupportedException) {
            return new ModelAndView("405");
        } else {
            return super.processHandlerException(request, response, handler, ex);
        }
    }

}
