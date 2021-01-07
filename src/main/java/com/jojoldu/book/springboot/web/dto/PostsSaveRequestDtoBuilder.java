package com.jojoldu.book.springboot.web.dto;

public class PostsSaveRequestDtoBuilder {
    private String title;
    private String content;
    private String author;

    public PostsSaveRequestDto build() {
        PostsSaveRequestDto requestDto = new PostsSaveRequestDto(title, content, author);
        return requestDto;
    }

    public PostsSaveRequestDtoBuilder title(String title) {
        this.title = title;
        return this;
    }

    public PostsSaveRequestDtoBuilder content(String content) {
        this.content = content;
        return this;
    }

    public PostsSaveRequestDtoBuilder author(String author) {
        this.author = author;
        return this;
    }
}
