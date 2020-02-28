package com.lcj.springboot.aop.service;
import com.lcj.springboot.aop.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * @Author: Elijah
 * @Date: 2020/2/28 16:44
 * @Description:使用注解的被拦截类
 */

@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
