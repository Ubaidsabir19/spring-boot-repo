package com.seamless.firstProject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    // default Path
    @GetMapping("/")
    public String hello(){
        return "Pakistan";
    }

    // @Value() used to get value from application.properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String getInfo(){
        return "Coach: " + coachName + ", Team: " + teamName;
    }

}
