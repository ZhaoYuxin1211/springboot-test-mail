package com.javasm.springboottestmail.common.http;

public enum EnumStatus {
    SUCCESS(20000,"成功"),
    ERROR(50000,"失败"),
    USERNAME_ERROR(40001,"用户名错误"),
    PASSWORD_ERROR(40002,"密码错误"),
    NO_LOGIN(50001,"未登录"),
    LOGON_SUCCESS(20001,"登录成功！");
    private  int status;
    private  String message;

    EnumStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }


   public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}