package com.workcheng.springboot;

import com.workcheng.springboot.config.MyProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        final MyProperty myProperty = new MyProperty();
        myProperty.run();
    }

}
