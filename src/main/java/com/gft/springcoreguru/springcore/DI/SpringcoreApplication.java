package com.gft.springcoreguru.springcore.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringcoreApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringcoreApplication.class, args);

        InjectedByContructorService contructorService = (InjectedByContructorService) ctx.getBean("injectedByContructorService");
        contructorService.getMessage();


        SetterBasedService setterBasedService = (SetterBasedService) ctx.getBean("setterBasedService");
        setterBasedService.getMessage();
    }

}
