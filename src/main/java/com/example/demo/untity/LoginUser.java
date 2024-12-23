package com.example.demo.untity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户实体类", description = "用户实体类")
public class LoginUser {
    @ApiModelProperty(value = "用户名")
    private String loginName;
    @ApiModelProperty(value = "用户密码")
    private String loginPsw;
    @ApiModelProperty(value = "验证码")
    private String captcha;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPsw() {
        return loginPsw;
    }

    public void setLoginPsw(String loginPsw) {
        this.loginPsw = loginPsw;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public LoginUser(String loginName, String loginPsw) {
        this.loginName = loginName;
        this.loginPsw = loginPsw;
    }

    public LoginUser() {
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "loginName='" + loginName + '\'' +
                ", loginPsw='" + loginPsw + '\'' +
                ", captcha='" + captcha + '\'' +
                '}';
    }
}
