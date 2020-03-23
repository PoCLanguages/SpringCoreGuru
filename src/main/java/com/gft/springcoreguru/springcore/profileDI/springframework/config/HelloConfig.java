package com.gft.springcoreguru.springcore.profileDI.springframework.config;

import com.gft.springcoreguru.springcore.profileDI.springframework.services.HelloWorldFactory;
import com.gft.springcoreguru.springcore.profileDI.springframework.services.HelloWorldService;
import com.gft.springcoreguru.springcore.profileDI.springframework.services.HelloWorldServiceEnglishImpl;
import com.gft.springcoreguru.springcore.profileDI.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("es");
    }

    @Bean(name = "french")
//    @Profile("french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("fr");
    }

    @Bean
//    @Profile("german")
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("de");
    }

    @Bean
//    @Profile("polish")
    public HelloWorldService helloWorldServicePolish(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("pl");
    }

    @Bean
//    @Profile("russian")
    public HelloWorldService helloWorldServiceRussian(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("ru");
    }

}
