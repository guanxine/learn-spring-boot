package com.example.user;

import com.example.config.KmxProperties;
import com.example.config.ThirdPartyConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private static final Logger logger = LoggerFactory
            .getLogger(UserController.class);

    @Value("${name}")
    private String name;

    @Autowired
    private KmxProperties kmxProperties;

    @Autowired
    private ThirdPartyConfig thirdPartyConfig;

    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        // ...
        logger.debug("This is a debug message {}", name);
        logger.info("This is an info message {}", name);
        logger.warn("This is a warn message {}", name);
        logger.error("This is an error message {}", name);
        return new User().setId(user.intValue()).setUsername("shaonian " + user + " env: " + kmxProperties.getK1() + ", third: " + thirdPartyConfig.getK1()).setAge(18);
    }
}
