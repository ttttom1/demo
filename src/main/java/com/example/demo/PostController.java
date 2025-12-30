package com.example.demo;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController //REST API declare
public class PostController {
    @GetMapping(value = "/posts", produces = "application/json; charset=UTF-8")
    public List<Post> getPosts() {
        return List.of(
                new Post(1L,"첫 번째 글","이미지 1번 실습 중입니다."),
                new Post(2L, "REST API란?","자원을 이름으로 구분하는 것!")
        );
    }

    //temporally replace DB
    private List<Post> postList = new ArrayList<>();
    private Long nextId = 1L;
    @PostMapping("/posts")
    public Post createPost(@RequestBody PostRequest request) {
        Post newPost = new Post(nextId++, request.getTitle(), request.getContent());

        postList.add(newPost);

        return newPost;
    }
}
