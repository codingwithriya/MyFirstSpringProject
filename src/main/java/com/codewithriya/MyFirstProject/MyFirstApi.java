package com.codewithriya.MyFirstProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyApis")
public class MyFirstApi {

    @GetMapping("/Api1")
    public String Api1(){
        return "This is my First Api";
    }

    @GetMapping("/Api2")
    public String Api2(){
        return "This is my Second Api";
    }

    @GetMapping("/Api3")
    public String Api3(){
        return "This is my Third Api";
    }

}
