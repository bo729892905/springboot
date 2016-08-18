package com.test.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ren.xiaobo on 2016/8/17.
 */
@Aspect
@Configuration
public class DruidAspect {
    @Pointcut("execution (* com.test.service.*.*(..))")
    public void druidStatPointcut(){}

    @Before("druidStatPointcut()")
    public void validateAccount() {
        System.out.println("==========================================================");
    }
}
