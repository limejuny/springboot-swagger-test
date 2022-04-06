package com.example.demo.api.post.service;

import com.example.demo.api.post.dto.PostInfoRes;
import com.example.demo.api.post.dto.PostSaveReq;
import com.example.demo.api.post.dto.PostSaveRes;
import com.example.demo.api.post.entity.PostMapper;
import com.example.demo.api.post.repository.PostRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {

  private final PostRepository postRepository;
  private final PostMapper postMapper;

  public PostSaveRes createPost(PostSaveReq postSaveReq) {
    return postMapper.toPostSaveRes(postRepository.save(postMapper.toPostEntity(postSaveReq)));
  }

  @Transactional(readOnly = true)
  public Page<PostInfoRes> retrievePostInfoList(Pageable pageable) {
    return postRepository.findAll(pageable).map(postMapper::toPostInfoRes);
  }

}
