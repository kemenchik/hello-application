package com.example.hello.application;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
public class HelloController {

  @Value("${app.message}")
  private String message;

  @GetMapping("/question")
  public String hello() {
    return message;
  }
}
