package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// import org.springframework.web.bind.annotation.GetMapping;
//     import org.springframework.web.bind.annotation.RequestParam;
//     import org.springframework.web.bind.annotation.RestController;

  //@RestController
//@ComponentScan("controllers")
@SpringBootApplication
@ComponentScan(basePackages={"controllers"}) 
    public class DemoApplication {
        public static void main(String[] args) 
        {
          SpringApplication.run(DemoApplication.class, args);
        }

        // @GetMapping("/hello")
        // public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        //   return String.format("Hello %s!", name);
        // }

        // @GetMapping("/prov")
        // public String Proverka(@RequestParam(value = "name", defaultValue = "Proverka") String name) {
        //   return String.format("Proverka %s!", name);
        // }
        // @GetMapping("/blog")
        // public String Blog()
        // {
        //   return "PostController";
        // }
    }

