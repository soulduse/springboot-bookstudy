package com.soul.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sould on 2016-08-19.
 */

@Controller
public class TestController {

    @RequestMapping(value = "test")
    public String testMethod(){
        return "/hello";
    }


}
