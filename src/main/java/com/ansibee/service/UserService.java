package com.ansibee.service;

import com.ansibee.model.UserInfo;

import java.util.List;

public interface UserService {

    int insert(UserInfo userInfo);

    UserInfo selectByUserId(Integer userId);

    List<UserInfo> selectAll();

}
