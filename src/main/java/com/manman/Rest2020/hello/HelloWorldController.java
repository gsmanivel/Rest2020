package com.manman.Rest2020.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

  //Uri
  //Get
  @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
  public String helloWorld(){
    return "Hello!. How are you ?";
  }

  @GetMapping("/hello1")
  public String hello1(){
    return "hello-1";
  }
}
