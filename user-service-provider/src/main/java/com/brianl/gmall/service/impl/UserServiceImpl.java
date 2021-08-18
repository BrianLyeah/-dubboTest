package com.brianl.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.brianl.gmall.bean.UserAddress;
import com.brianl.gmall.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-03-24 23:45
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        ArrayList<UserAddress> list = new ArrayList<>();
        UserAddress userAddress = new UserAddress();
        userAddress.setId(123123);
        userAddress.setPhoneNum("saldkasjdflkjsadlsajflsakfdjlsfdjlaskfd");
        list.add(userAddress);
        return list;
    }
}
