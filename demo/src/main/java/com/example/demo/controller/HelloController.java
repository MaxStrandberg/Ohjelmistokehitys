package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
@RequestMapping("hello")
public String hello(@RequestParam(name="firstname") String firstname, @RequestParam(name="lastname")String lastname) {
return "Hello " + firstname + " " + lastname;
}
}
