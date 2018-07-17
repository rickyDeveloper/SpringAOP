package com.naiyarv.aop;

import org.springframework.stereotype.Component;

/**
 * Created by vikasnaiyar on 17/07/18.
 */
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
