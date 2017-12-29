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
    private Long userID;
    private String loginName;
    private String userName;
    private String userPwd;
    private String phoneNum;
    private String companyName;
    private String userRole;

    public LoginUser(){
    }

    public LoginUser(Long userID, String loginName, String userName, String userPwd, String phoneNum, String companyName, String userRole) {
        this.userID = userID;
        this.loginName = loginName;
        this.userName = userName;
        this.userPwd = userPwd;
        this.phoneNum = phoneNum;
        this.companyName = companyName;
        this.userRole = userRole;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
