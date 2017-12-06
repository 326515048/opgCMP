package com.opg.jpademo;

import com.opg.jpademo.LoginUser.LoginUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by fan.shijun on 2017-12-05.
 */
public class MyInterceptor1 implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(MyInterceptor1.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        String url = httpServletRequest.getRequestURL().toString();
//        String method = httpServletRequest.getMethod();
//        String uri = httpServletRequest.getRequestURI();
//        String queryString = httpServletRequest.getQueryString();
//        logger.info(String.format("请求参数, url: %s, method: %s, uri: %s, params: %s", url, method, uri, queryString));
        Object obj = httpServletRequest.getSession().getAttribute("cur_user");
        if (obj == null) {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
