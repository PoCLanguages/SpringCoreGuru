package com.gft.springcoreguru.springcore.DI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByContructorService {

    private HelloWorldService helloWorldService;

    @Autowired
    public InjectedByContructorService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(){
        helloWorldService.sayHello();
    }


}
