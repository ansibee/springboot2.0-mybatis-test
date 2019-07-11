package com.ansibee.service.impl;

import com.ansibee.mapper.UserMapper;
import com.ansibee.model.UserInfo;
import com.ansibee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int insert(UserInfo userInfo) {
        return userMapper.insert(userInfo);
    }

    @Override
    public UserInfo selectByUserId(Integer userId) {
        return userMapper.selectByUserId(userId);
    }

    @Override
    public List<UserInfo> selectAll() {
        return userMapper.selectAll();
    }

}
