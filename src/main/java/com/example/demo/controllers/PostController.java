package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Post;
import com.example.demo.Repo.PostRepository;

@Controller
public class PostController 
{
    // public static void main(String[] args) 
    // {
    //     SpringApplication.run(PostController.class, args);
    // }

    // @GetMapping("/hello")
    //  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) 
    //  {
    //   return String.format("Hello %s!", name);
    //  }

    // @Autowired
    // private PostRepository postrep;

    // @GetMapping("/")
    // public String blogMain(Model model)
    // {
    //     Iterable<Post> posts = postrep.findAll();
    //     model.addAttribute("posts", posts);
    //     return "blog-main";
    // }
}
