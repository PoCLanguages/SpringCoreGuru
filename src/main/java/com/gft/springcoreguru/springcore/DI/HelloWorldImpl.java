package com.gft.springcoreguru.springcore.DI;

import org.springframework.stereotype.Component;



@Component
public class HelloWorldImpl implements HelloWorldService{

    public void sayHello(){
        System.out.println("Hello World !! ");
    }

}
