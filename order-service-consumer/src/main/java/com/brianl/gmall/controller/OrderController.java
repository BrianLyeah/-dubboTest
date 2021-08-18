package com.brianl.gmall.controller;

import com.brianl.gmall.bean.UserAddress;
import com.brianl.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.brianl.gmall.service.impl.TestAA;

import java.io.IOException;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-03-25 1:07
 */
@RestController
@RequestMapping("/con")
public class OrderController {

    @Autowired
    TestAA testAA;

    @Autowired
    OrderService orderService;

    @GetMapping("/test")
    public List<UserAddress> test() {
        List<UserAddress> userAddresses = orderService.initOrder("123");
        return userAddresses;

    }

    @PostMapping("/school")
    public void school() throws IOException {
        orderService.School();
    }

    @GetMapping("/getMap")
    public String getMap() throws IOException {
        return orderService.getMap();
    }

}
