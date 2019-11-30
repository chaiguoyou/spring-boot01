package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2019/11/27.
 */
@SpringBootApplication
public interface SpringBootUserApplication {
    public static void main(String[] args) {
        System.out.println("123456");
        System.out.println("123456123");
        SpringApplication.run(SpringBootUserApplication.class);
    }
}
