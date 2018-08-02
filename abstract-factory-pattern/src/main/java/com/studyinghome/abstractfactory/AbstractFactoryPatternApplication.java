package com.studyinghome.abstractfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryPatternApplication.class, args);
        MakePeople.make();
    }
}
