package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {
    private long id;

    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title; //should be not null or empty and have at least 2 chars

    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description; //should be not null or empty and have at least 10 chars

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
