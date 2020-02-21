package com.shop.manage.service;

import com.shop.manage.model.User;

import java.util.List;

public interface UserService {

    User getUserByName(String username);

    List<User> getUserList();
}
