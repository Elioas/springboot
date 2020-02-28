package com.lcj.springboot.aop;

import com.lcj.springboot.SpringbootApplication;
import com.lcj.springboot.aop.service.DemoAnnotationService;
import com.lcj.springboot.aop.service.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Elijah
 * @Date: 2020/2/28 16:56
 * @Description:
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringbootApplication.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
    }

}
