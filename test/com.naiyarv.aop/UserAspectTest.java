package com.naiyarv.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by vikasnaiyar on 17/07/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserAspectTest {

    private Logger LOGGER = LoggerFactory.getLogger(UserAspectTest.class);

    @Autowired
    UserService userService;

    @Test
    public void testUserAspect() {
        LOGGER.info(userService.getUser("Ricky").getName());
    }

}
