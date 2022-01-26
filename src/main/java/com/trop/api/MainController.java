package com.trop.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Getter;
import lombok.Setter;

@Controller
public class MainController {
    
    @GetMapping(value = "/main/string")
    @ResponseBody
    public String mainString() {
        return "hello world!";
    }
    @GetMapping(value = "/main/json")
    @ResponseBody
    public Hello mainJson() {
        Hello hello = new Hello();
        hello.message = "hello world!";
        return hello;
    }
    @GetMapping(value = "/main/page")
    public String mainFtl() {
        return "main";
    }

    @Setter
    @Getter
    public static class Hello {
        private String message;
    }
}
