package de.aclue.springbootdatabasedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/")
  String home() {
    return "Hello World!";
  }
}
