package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.test.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ren.xiaobo on 2016/8/17.
 */
@Service
public class UserServiceImpl  implements UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        logger.info("insert user:" + user.toString());
        userMapper.insert(user);
    }

    @Override
    public User getById(long id) {
        return userMapper.getById(id);
    }
}
