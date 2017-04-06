package com.phyl.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh on 2017/4/6.
 */
@RestController
@RequestMapping(value = "/test", method = {RequestMethod.POST, RequestMethod.GET})
public class TestController {
    @PostMapping("test")
    public String test() {
        return "";
    }

}
