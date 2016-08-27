package com.test.service;

import com.test.Application;
import com.test.mapper.UserMapper;
import com.test.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * Created by ren.xiaobo on 2016/8/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@ActiveProfiles(value="dev")
public class UserServiceTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    @Transactional
    @Rollback(false)
    public void insert() throws Exception {
        User user = new User();
        user.setId(1);
        user.setUsername("zhangsan");
        userMapper.insert(user);
        System.out.println("插入用户信息"+user.getUsername());
    }

}