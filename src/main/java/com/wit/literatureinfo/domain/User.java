package com.wit.literatureinfo.domain;

/**
 * 用户Data类
 */
public class User {
    // 用于数据库主键
    private long user_id;
    // 用户名，不能重复
    private String user_name;
    // 用户密码
    private String password;
    // 手机号
    private String role_id;

    public long getId() {
        return user_id;
    }

    public void setId(long user_id) {
        this.user_id = user_id;
    }

    public String getAccount_number() {
        return user_name;
    }

    public void setAccount_number(String user_name) {
        this.user_name = user_name;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

