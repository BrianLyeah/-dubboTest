package com.brianl.gmall.service.impl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-07-13 17:03
 */

@Component
@Data
public class TestAA {

    private static String test;

    @Value("${app.id}")
    public void setTest(String id){
        Executors.newFixedThreadPool(1);
    }

    public String getTest(){

        return test;
    }



}
