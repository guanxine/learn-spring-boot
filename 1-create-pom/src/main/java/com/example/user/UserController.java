package com.example.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private static final Logger logger = LoggerFactory
            .getLogger(UserController.class);

    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        // ...
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return new User().setId(user.intValue()).setUsername("shaonian " + user).setAge(18);
    }
}
