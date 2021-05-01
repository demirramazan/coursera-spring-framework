package com.rdemir.coursera.courseraspringframework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CourseraSpringFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseraSpringFrameworkApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            System.out.println("Lets inspect bean the beans provided by Spring Boot ");
            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String bean : beanNames) {
                System.out.println(bean);
            }
        };
    }
}
//curl localhost:8080 ->Hello World