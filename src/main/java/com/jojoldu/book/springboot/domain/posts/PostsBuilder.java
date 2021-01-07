package com.jojoldu.book.springboot.domain.posts;

import java.time.LocalDateTime;

public class PostsBuilder {
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String title;
    private String content;
    private String author;

    public Posts build() {
        Posts posts = new Posts(title, content, author);
        return posts;
    }

    public PostsBuilder title(String title) {
        this.title = title;
        return this;
    }

    public PostsBuilder content(String content) {
        this.content = content;
        return this;
    }

    public PostsBuilder author(String author) {
        this.author = author;
        return this;
    }
}