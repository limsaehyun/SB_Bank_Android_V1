package com.example.bank;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Method;
import java.util.Map;

import retrofit2.Response;

public class LoginRequest {
    String username;
    String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
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
}
