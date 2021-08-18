package com.brianl.gmall.service;

import com.brianl.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {

    public List<UserAddress> getUserAddressList(String userId);

}
