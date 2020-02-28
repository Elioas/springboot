package com.lcj.springboot.controller;

import com.lcj.springboot.aop.service.DemoAnnotationService;
import com.lcj.springboot.aop.service.DemoMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Elijah
 * @Date: 2020/2/28 16:59
 * @Description:测试aop
 */
@RestController
public class TestAopController {
    @Autowired
    private DemoAnnotationService demoAnnotationService;
    @Autowired
    private DemoMethodService demoMethodService;

    @RequestMapping(value = "/aop/annotation")
    public void testAnnotation(){
        demoAnnotationService.add();
    }

    @RequestMapping(value = "/aop/method")
    public void testMethod(){
        demoMethodService.add();
    }
}
