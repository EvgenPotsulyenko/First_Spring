package com.example.demo.Models;

import jakarta.persistence.Id;
//import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Post 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String text;

    public long getId()
    {
       return id;
    }
    public void setId(long id)
    {
       this.id = id;
    }
    public String getText()
    {
       return text;
    }
    public void setText(String text)
    {
       this.text = text;
    }

}
