package com.example.demo;

public class User {
    private String username;
    private String password;
    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

    //getters
    public String getUsername(){
        return username;
    }
    public String getPassword() {
        return password;
    }
}
