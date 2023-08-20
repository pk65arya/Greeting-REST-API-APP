package com.GreetingApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
@Entity
@Getter
@Table(name = "GREETING")
public class Greeting {
    @Id
    @Column(name = "id",nullable = false)
    private final long id;
    private String message;

    public Greeting(Long id,String message){
        this.id=id;
        this.message=message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Greeting(){
        id=0;
        message="";
    }
}
