package com.example.demo;

public class Post {
    private Long id;    //post id
    private String title;   //post title
    private String content; //content

    public Post(Long id,String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }

    //데이터를 꺼낼 때 사용하는 Getters
    public Long getId() { return id;}
    public String getTitle() {return title; }
    public String getContent() { return content; }
}
