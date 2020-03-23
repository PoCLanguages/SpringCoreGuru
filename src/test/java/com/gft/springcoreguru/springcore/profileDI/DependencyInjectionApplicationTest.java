package com.gft.springcoreguru.springcore.profileDI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = DependencyInjectionApplicationTest.class)
class DependencyInjectionApplicationTest {

    @Test
    public void contextLoads() {
    }

}
