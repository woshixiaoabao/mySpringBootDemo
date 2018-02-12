package com.abao.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {
  
  @ResponseStatus(HttpStatus.OK)
  @ExceptionHandler(Exception.class)
  @RequestMapping
  public Object handleBizExp(HttpServletRequest request, Exception ex) {
    log.info("Business exception handler  " + ex.getMessage());
    request.getSession(true).setAttribute("aaa", ex.getMessage());
    return new ResponseEntity<>(ex.getMessage(), HttpStatus.OK);
  }
}
