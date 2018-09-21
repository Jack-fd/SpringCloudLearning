package com.github.demo.controller;

import com.github.demo.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
