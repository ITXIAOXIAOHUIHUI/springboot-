package com.example.springboot_jhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan
@SpringBootApplication
public class SpringbootJhhApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJhhApplication.class, args);
    }
}
