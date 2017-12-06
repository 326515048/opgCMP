package com.opg.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by fan.shijun on 2017-12-05.
 */
@Configuration
public class CustomWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        MyInterceptor1  myInterceptor1 = new MyInterceptor1();
        registry.addInterceptor(myInterceptor1).addPathPatterns("/**").excludePathPatterns("/login*");
    }
}
