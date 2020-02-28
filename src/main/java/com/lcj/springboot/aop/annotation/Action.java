package com.lcj.springboot.aop.annotation;
import java.lang.annotation.*;
/**
 * @Author: Elijah
 * @Date: 2020/2/28 16:38
 * @Description:拦截规则的注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
