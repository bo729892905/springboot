package com.test.service;

import com.test.mapper.UserMapper;
import com.test.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ren.xiaobo on 2016/8/17.
 */
public interface UserService{
    void insert(User user);

    User getById(long id);
}
