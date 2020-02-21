package com.shop.manage.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author 过滤器配置
 */
@Component
public class FilterRegisterConfig {

    @Bean(name = "CorsFilter")
    public FilterRegistrationBean corsFilterRegister() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        // 注入过滤器
        registration.setFilter(new CorsFilter());
        // 拦截规则
        registration.addUrlPatterns("/*");
        // 过滤器名称
        registration.setName("CorsFilter");
        // 是否自动注册 false 取消Filter的自动注册
        registration.setEnabled(true);
        // 过滤器顺序
        registration.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return registration;
    }
}
