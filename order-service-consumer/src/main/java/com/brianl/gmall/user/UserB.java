package com.brianl.gmall.user;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-28 10:00
 */
@Data
@Component
public class UserB {

    @Autowired
    private UserA userA;


    private int age;
    private String name;
}
