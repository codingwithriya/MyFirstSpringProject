package com.codewithriya.MyFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teacher {

    @Autowired
    Student s1;

    @GetMapping("/hello")
    public String Greetings(){
        return s1.hello();
    }




}
