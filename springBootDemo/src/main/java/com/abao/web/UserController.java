package com.abao.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abao.exception.BusinessException;

@RestController
@RequestMapping("/abao")
public class UserController {

  @GetMapping("/login")
  public Object checkAccount() throws BusinessException{
    throw new BusinessException("业务执行异常");  
  }
}
