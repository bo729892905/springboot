package com.test.mapper;

import com.test.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by ren.xiaobo on 2016/8/17.
 */
@Repository
public interface UserMapper {
    void insert(User user);

    User getById(long id);
}
