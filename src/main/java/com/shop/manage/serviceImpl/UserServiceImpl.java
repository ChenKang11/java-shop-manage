package com.shop.manage.serviceImpl;

import com.shop.manage.mapper.UserMapper;
import com.shop.manage.model.User;
import com.shop.manage.model.UserExample;
import com.shop.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if(!users.isEmpty()){
            return users.get(0);
        }
        return null;
    }

    @Override
    public List<User> getUserList() {
        UserExample userExample = new UserExample();
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
}
