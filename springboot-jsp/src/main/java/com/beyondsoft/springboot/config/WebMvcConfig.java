package com.beyondsoft.springboot.config;

import com.beyondsoft.springboot.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.beyondsoft.springboot.config.WebMvcConfig
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: gaolongfei
 * @date: 2020/9/14 11:37
 */

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/error")
                .excludePathPatterns("/login")
                .excludePathPatterns("/getVerifyCode");
    }

}
