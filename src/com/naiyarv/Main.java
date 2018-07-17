package com.naiyarv;

import com.naiyarv.aop.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
	    SpringApplication springApplication = new SpringApplication();
        ApplicationContext applicationContext = springApplication.run(Main.class,args);

        UserService us = (UserService) applicationContext.getBean("userService");
        us.getUser("Ricky");

    }
}
