package com.punit.merchant_management.controller;

import com.punit.merchant_management.entity.TestEntity;
import com.punit.merchant_management.model.TestModel;
import com.punit.merchant_management.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    //    @GetMapping("/hello/{id}/{name}")
    public String helloWithPathVariable(@PathVariable String id, @PathVariable String name) {
        return "Hello, World! id = " + id + " name = " + name;
    }

    @GetMapping
//    @RequestMapping("/hello")
    public String helloWithRequestParam(@RequestParam String id, @RequestParam String name) {
        return "Hello, World! id = " + id + " name = " + name;
    }

    @PostMapping
    private String createTest(@RequestBody TestModel test) {
        System.out.println(test);
        TestEntity testEntity = testService.saveTestEntity(test);
        return "Test created: " + testEntity;
    }
}
