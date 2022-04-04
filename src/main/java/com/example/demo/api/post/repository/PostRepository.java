package com.example.demo.api.post.repository;

import java.util.List;

import com.example.demo.api.post.entity.PostEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {

  List<PostEntity> findByPostAuthor(String postAuthor);

  List<PostEntity> findByPostId(String postId);

  List<PostEntity> findByPostIp(String postIp);

}
