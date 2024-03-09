package com.example.hello.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/question")
  public String hello() {
    return "Когда приедете делать свечки?";
  }
}
