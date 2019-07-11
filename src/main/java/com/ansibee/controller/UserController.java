package com.ansibee.controller;

import com.ansibee.model.UserInfo;
import com.ansibee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public Integer insert(UserInfo userInfo){
        return userService.insert(userInfo);
    }

    @RequestMapping("/selectByUserId/{userId}")
    public UserInfo selectByUserId(@PathVariable("userId") Integer userId){
        return userService.selectByUserId(userId);
    }

    @RequestMapping("/selectAll")
    public List<UserInfo> selectAll(){
        return userService.selectAll();
    }

}
