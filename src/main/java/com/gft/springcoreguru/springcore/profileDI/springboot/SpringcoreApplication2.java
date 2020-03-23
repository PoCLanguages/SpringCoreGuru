package com.gft.springcoreguru.springcore.profileDI.springboot;

import com.gft.springcoreguru.springcore.profileDI.springframework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan("com.gft.springcoreguru.springcore.profileDI.springframework")
//Se usamos XML configuration devemos adicionar importar aqui
@ImportResource("classpath:/spring/spring-config.xml")
public class SpringcoreApplication2 {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringcoreApplication2.class, args);

        GreetingController controller = (GreetingController) ctx.getBean("greetingController");
        controller.sayHello();


    }

}
