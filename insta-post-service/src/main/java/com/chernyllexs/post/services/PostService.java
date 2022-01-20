package com.chernyllexs.post.services;

import com.chernyllexs.post.models.PostDto;

import java.util.List;

public interface PostService {
    void deletePostById(Long id);

    void addPost(PostDto newBookDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(Long id);
}
