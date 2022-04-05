package com.example.demo.api.post.entity;

import com.example.demo.api.post.dto.PostSaveReq;
import com.example.demo.api.post.dto.PostSaveRes;

import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {

  PostSaveRes toPostSaveRes(PostEntity postEntity);

  PostEntity toPostEntity(PostSaveReq postSaveReq);

}
