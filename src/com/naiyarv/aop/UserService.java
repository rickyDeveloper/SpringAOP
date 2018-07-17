package com.naiyarv.aop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by vikasnaiyar on 17/07/18.
 */
@Qualifier("userService")
@Service
public class UserService {


    public User getUser(String userName) {

        User user = new User();
        user.setName("Ricky");

        return user;
    }
}
