package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProvContr 
{
    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) 
      {
       return String.format("Hello %s!", name);
      }
}
