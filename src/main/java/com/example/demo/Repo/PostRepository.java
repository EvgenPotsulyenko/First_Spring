package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Post;

public interface PostRepository extends CrudRepository<Post, Long> 
{
    
}
