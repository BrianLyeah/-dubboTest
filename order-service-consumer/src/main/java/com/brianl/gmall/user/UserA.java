package com.brianl.gmall.user;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-28 9:59
 */
@Getter
@Setter
@Component
public class UserA {

    @Autowired
    private UserB userB;

    private int age;
    private String name;

    public UserA(String name){
        this.name=name;
    }

    public UserA(){
    }

    public String msg(){
        return "msg";
    }

    public int getAge(){
        return this.age;
    }

}
