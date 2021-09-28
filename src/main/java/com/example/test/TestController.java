package com.example.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

  @GetMapping("/1")
  public void test1(){
    System.out.println(1);
    System.out.println("hi");
    System.out.println("count : 2");
  }

  @GetMapping("/2")
  public void test2(){
    System.out.println(2);
  }

  @GetMapping("/3")
  public void test3(){
    System.out.println(3);
  }


}
