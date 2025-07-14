package com.rufu_spring.learn_spring_boot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    //dependency injection the instance is handled by Beans in that
    // @Component annotation in Cu..Ser..Configuration class
    @Autowired
    CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration retriveAllCourses(){
        return configuration;
    }
}
