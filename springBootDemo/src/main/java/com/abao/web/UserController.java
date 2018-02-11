package com.abao.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abao")
public class UserController {

  @GetMapping("/login")
  public Object checkAccount() {
    return 1;
  }
}
