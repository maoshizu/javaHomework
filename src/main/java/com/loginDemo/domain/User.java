package com.loginDemo.domain;

import javax.persistence.*;

@Table(name="user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;

    private int password;

    private int user_status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getUser_status() {
        return user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }

    public User(String username, int password, int user_status) {
        this.username = username;
        this.password = password;
        this.user_status = user_status;
    }
}
