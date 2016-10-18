package com.test.service;

import com.test.model.User;

import java.util.List;

/**
 * Created by ren.xiaobo on 2016/8/17.
 */
public interface UserService{
    void insert(User user);

    User getById(long id);

    List<User> getUsers();
}
