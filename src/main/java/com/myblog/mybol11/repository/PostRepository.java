package com.myblog.mybol11.repository;

import com.myblog.mybol11.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
