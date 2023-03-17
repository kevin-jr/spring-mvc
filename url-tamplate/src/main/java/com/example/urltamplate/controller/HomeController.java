package com.example.urltamplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
// curl http://localhost:8080/person/John/city/Mandalay/hobby/Reading/age/23
    @GetMapping("/person/{name}/city/{city}/hobby/{hobby}/age/{age}")
    public String personInfo(
            @PathVariable("name")String name,
            @PathVariable String city,
            @PathVariable("hobby")String myHobby,
            @PathVariable int age
    ) {
        return  String.format(
                "Name : [%s]\nCity : [%s]\nHobby : [%s]\nAge : [%s]",name,city,myHobby,age
        );

    }
}
