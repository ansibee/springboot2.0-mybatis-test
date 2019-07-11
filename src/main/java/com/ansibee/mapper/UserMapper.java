package com.ansibee.mapper;

import com.ansibee.model.UserInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    int insert(UserInfo userInfo);

    UserInfo selectByUserId(Integer userId);

    @Select("select * from user_info")
    List<UserInfo> selectAll();
}
