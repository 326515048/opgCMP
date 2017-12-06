package com.opg.jpademo.LoginUser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by fan.shijun on 2017-12-04.
 */
@Entity
public class LoginUser {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String userPwd;
    private String phoneNum;

    public LoginUser() {
    }

    public LoginUser(Long id, String userName, String userPwd, String phoneNum) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.phoneNum = phoneNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
