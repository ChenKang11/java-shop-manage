package com.shop.manage.controller;

import com.shop.manage.constant.CommonConstant;
import com.shop.manage.model.User;
import com.shop.manage.service.UserService;
import com.shop.manage.utils.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResultMap login(@RequestParam String username,@RequestParam String password){
        //String username = loginUser.getUsername();
        //String password = loginUser.getPassword();
        User user = userService.getUserByName(username);
        if(user != null){
            String pwd = user.getPassword();
            if(pwd.equals(password)){
                String token = "123123123";
                return new ResultMap(CommonConstant.SUCCESS,"登录成功", token);
            }else{
                return new ResultMap(CommonConstant.ERROR,"密码错误");
            }
        }else {
            return new ResultMap(CommonConstant.ERROR,"用户不存在");
        }
    }

    @GetMapping("/list")
    public ResultMap getUserList(){
        List<User> userList = userService.getUserList();
        return new ResultMap(CommonConstant.SUCCESS,"获取用户列表成功",userList);
    }
}
