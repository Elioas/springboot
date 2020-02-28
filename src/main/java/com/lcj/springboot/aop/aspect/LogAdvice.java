package com.lcj.springboot.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author: Elijah
 * @Date: 2020/2/28 17:40
 * @Description:
 */
@Component
@Aspect
public class LogAdvice {
    @AfterReturning("execution(void *User(..))")
    public void log(JoinPoint jp){
        String name=jp.getSignature().getName();
        System.out.println(name+"执行之后记录成功");
    }
}
