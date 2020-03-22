package com.gft.springcoreguru.springcore.profileDI.springframework.config;

import com.gft.springcoreguru.springcore.profileDI.springframework.services.HelloWorldService;
import com.gft.springcoreguru.springcore.profileDI.springframework.services.HelloWorldServiceEnglishImpl;
import com.gft.springcoreguru.springcore.profileDI.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldServiceSpanishImpl();
    }

}
