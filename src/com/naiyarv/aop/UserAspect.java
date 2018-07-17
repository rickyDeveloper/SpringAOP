package com.naiyarv.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by vikasnaiyar on 17/07/18.
 */
@Aspect
@Component
public class UserAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAspect.class);

    @Before("execution(* com.naiyarv.aop.UserService.getUser (java.lang.String)) && args(userName)")
    public void beforeUserCreation(String userName) {

        LOGGER.info(" Request came for user : " + userName);
    }

    @Before("execution(* com.naiyarv.aop.UserService.getUser(..))")
    public void before(JoinPoint joinPoint){
        //Advice
        LOGGER.info(" Executing advice for {}", joinPoint);
    }
}
