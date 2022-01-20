package com.chernyllexs.post.services;

import com.chernyllexs.post.models.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    @Override
    public void deletePostById(Long id) {

    }

    @Override
    public void addPost(PostDto newBookDto) {

    }

    @Override
    public List<PostDto> getAllPosts() {
        return null;
    }

    @Override
    public PostDto getPostById(Long id) {
        return null;
    }
}
