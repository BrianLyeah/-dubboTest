package com.brianl.gmall.service;

import com.brianl.gmall.bean.UserAddress;

import java.io.IOException;
import java.util.List;

public interface OrderService {

    List<UserAddress> initOrder(String userId);

    void School() throws IOException;

    String getMap();
}
