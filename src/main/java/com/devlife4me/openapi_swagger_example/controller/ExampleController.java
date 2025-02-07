package com.devlife4me.openapi_swagger_example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class ExampleController {

    @GetMapping("/example-endpoint")
    public String getExample() {
        return "This is an Example";
    }
}
