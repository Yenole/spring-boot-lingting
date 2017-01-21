package com.j2ustc.lingting.model;

import java.util.Date;

/**
 * Created by yenole on 2017/1/18.
 */
public class User {
    int id;
    String username;
    String password;
    int flags;
    Date logintime;
    Date registtime;
    int numlogin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public int getNumlogin() {
        return numlogin;
    }

    public void setNumlogin(int numlogin) {
        this.numlogin = numlogin;
    }
}
