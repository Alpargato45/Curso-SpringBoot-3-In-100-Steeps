package com.jorge.spring.learn_spring_framework.enterprise.web;

import com.jorge.spring.learn_spring_framework.enterprise.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    @Autowired
    private BusinessService businessService;

    public long returnValueFromBussinessService() {
        return businessService.calculateSum();
    }
}
