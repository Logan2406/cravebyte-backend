package com.cravebyte.cravebyte_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test()
    {
        return "This is for test only";
    }
}

