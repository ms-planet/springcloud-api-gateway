package com.imooc.apigateway;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Component;

/**
 * @author zxlei
 * @date 2019/8/29 16:29
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Component
public class ZuulConfig {

//    @ConfigurationProperties("zuul")
//    @RefreshScope
//    public ZuulProperties zuulProperties() {
//        return new ZuulProperties();
//    }
}
