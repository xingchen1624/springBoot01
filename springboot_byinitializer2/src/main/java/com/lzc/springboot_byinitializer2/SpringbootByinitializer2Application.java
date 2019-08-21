package com.lzc.springboot_byinitializer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringbootByinitializer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootByinitializer2Application.class, args);
    }

}
