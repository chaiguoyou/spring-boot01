package com.qf.service;

import com.qf.domain.User;
import com.qf.response.UserResponse;

/**
 * Created by Administrator on 2019/11/27.
 */
public interface UserService {
    UserResponse findAll(Integer size, Integer page);

    User findById(Integer id);

    User saveAndFlush(User user);

    String deleteById(User user);
}
