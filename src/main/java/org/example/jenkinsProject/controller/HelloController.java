package org.example.jenkinsProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello")
    public String helloPage(){
        return "hello";
    }
    @GetMapping("/goodbye")
    public String goodBye(){
        return "goodbye";
    }
}
