package com.bin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by  bin
 * Time： 2017/11/21.
 */
@RestController
public class HelloBoot {
    @RequestMapping(value = "/hello", method = RequestMethod.GET )
    public String hello(){
        return "hello boot!";
    }
}
