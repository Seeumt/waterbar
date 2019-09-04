package com.b303;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WaterbarApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterbarApplication.class, args);
        System.out.println("还不行？");
        System.out.println("行了吧！");
    }

}
