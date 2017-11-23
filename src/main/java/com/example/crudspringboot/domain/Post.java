package com.example.crudspringboot.domain;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String message;

    public Post(){

    }

    public Post(String message){
        this.message = message;
    }


    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
