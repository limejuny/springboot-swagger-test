package com.example.demo.api.post.controller;

import javax.validation.Valid;

import com.example.demo.api.post.dto.PostInfoRes;
import com.example.demo.api.post.dto.PostSaveReq;
import com.example.demo.api.post.dto.PostSaveRes;
import com.example.demo.api.post.service.PostService;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
@Tag(name = "게시글 관련 컨트롤러")
public class PostController {

  private final PostService postService;

  @Operation(summary = "게시글 등록", description = "게시글 등록 API 설명")
  @ApiResponses({
      @ApiResponse(responseCode = "201", description = "등록 성공"),
      @ApiResponse(responseCode = "400", description = "잘못된 요청", content = @Content)
  })
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public PostSaveRes createPost(@Valid @RequestBody PostSaveReq postSaveReq) {
    return postService.createPost(postSaveReq);
  }

  @Operation(summary = "게시글 목록 조회", description = "게시글 목록 조회 API 설명")
  @ApiResponses({
      @ApiResponse(responseCode = "200", description = "조회 성공"),
  })
  @GetMapping
  public Page<PostInfoRes> retrievePostInfoList(@ParameterObject Pageable pageable) {
    return postService.retrievePostInfoList(pageable);
  }

}
