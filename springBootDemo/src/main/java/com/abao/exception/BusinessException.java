package com.abao.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 688854873868298461L;
  // 业务类型
  private String bizType;
  // 业务代码
  private int bizCode;
  // 错误信息
  private String message;

  public BusinessException(String bizType, int bizCode, String message) {
    super(message);
    this.bizType = bizType;
    this.bizCode = bizCode;
    this.message = message;
  }

  public BusinessException(String message) {
    super(message);
    this.bizType = "";
    this.bizCode = -1;
    this.message = message;
  }

  public BusinessException(String bizType, String message) {
    super(message);
    this.bizType = bizType;
    this.bizCode = -1;
    this.message = message;
  }

  public BusinessException(int bizCode, String message) {
    super(message);
    this.bizType = "";
    this.bizCode = bizCode;
    this.message = message;
  }
}
