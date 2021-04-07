package com.wit.literatureinfo.domain;

/**
 * 用户Data类
 */
public class User {
    // 用于数据库主键
    private long id;
    // 用户名，不能重复
    private String account_number;
    // 用户密码
    private String password;
    // 手机号
    private long role_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

