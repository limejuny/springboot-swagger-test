package com.example.demo.api.post.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import com.example.demo.api.post.dto.PostInfoRes;
import com.example.demo.api.post.dto.PostSaveReq;
import com.example.demo.api.post.dto.PostSaveRes;
import com.example.demo.api.post.service.PostService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
@Api(tags = { "게시글 관련 컨트롤러" })
public class PostController {

  private final PostService postService;

  @ApiOperation(value = "게시글 등록", notes = "API 설명설명")
  @ApiResponses({
      @ApiResponse(code = 201, message = "등록 성공"),
      @ApiResponse(code = 400, message = "잘못된 요청")
  })
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping(value = "")
  public PostSaveRes createPost(@Valid @RequestBody PostSaveReq postSaveReq) {
    return postService.createPost(postSaveReq);
  }

  @ApiOperation(value = "게시글 목록 조회", notes = "게시글 목록 조회")
  @ApiResponses({
      @ApiResponse(code = 200, message = "조회 성공"),
  })
  @GetMapping(value = "")
  public List<PostInfoRes> retrievePostInfoList() {
    return postService.retrievePostInfoList();
  }

}
