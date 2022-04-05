package com.example.demo.api.post.entity;

import java.util.List;

import com.example.demo.api.post.dto.PostInfoRes;
import com.example.demo.api.post.dto.PostSaveReq;
import com.example.demo.api.post.dto.PostSaveRes;

import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {

  PostSaveRes toPostSaveRes(PostEntity postEntity);

  List<PostInfoRes> toPostInfoResList(List<PostEntity> postEntityList);

  PostEntity toPostEntity(PostSaveReq postSaveReq);

}
