package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    //sample user
    private User adminUser = new User("admin","password123");

    @PostMapping("/login")
    public String login(@RequestBody User loginRequest) {
        if(adminUser.getUsername().equals(loginRequest.getUsername()) &&
        adminUser.getPassword().equals(loginRequest.getPassword())) {
            return "로그인 성공! 환영합니다 " + loginRequest.getUsername() + "님.";

        } else {
            return "로그인 실패: 아이디 또는 비밀번호가 틀렸습니다.";
        }
    }
}
