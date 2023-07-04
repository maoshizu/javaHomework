package com.loginDemo.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
//添加第三第四处是因为主键是string，但是现在不成功
//@GenericGenerator(name = "username", strategy = "uuid")//添加3处
@Table(name="user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//代码原始的，当主键是int时有效
    //@GeneratedValue(generator = "username")//添加第4处
    private int username;

    private String password;

    private int user_status;

    private String phone;

    private String gender;

    private int class_id;

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUser_status() {
        return user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }
}
