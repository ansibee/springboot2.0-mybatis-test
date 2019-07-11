package com.ansibee.mapper;

import com.ansibee.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("诸葛亮");
        Assert.assertEquals(1,userMapper.insert(userInfo));
    }

    @Test
    public void selectByUserId() throws Exception {
        UserInfo userInfo = userMapper.selectByUserId(1);
        log.info("【查询用户】userInfo={}",userInfo);
        Assert.assertNotEquals(null,userInfo);
    }

    @Test
    public void selectAll() throws Exception {
        List<UserInfo> userInfoList = userMapper.selectAll();
        log.info("【查询所有】userInfoList={}",userInfoList);
        Assert.assertNotEquals(null,userInfoList);
    }

}