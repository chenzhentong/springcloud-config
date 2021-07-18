package com.nantian.uccp.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * EnableTransactionManagement 开启事务管理注解
 * ServletComponentScan 启用扫描Servlet组件注解
 *
 * @Author: Song Pengbo
 * @Date: 2021/7/18 16:19
 */
@SpringBootApplication(scanBasePackages = "com.nantian")
@EnableTransactionManagement
@ServletComponentScan("com.nantian.**.**.controller")
@MapperScan("com.nantian.**.**.dao")
public class ITSMWebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ITSMWebApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ITSMWebApplication.class);
    }
}
