package com.xu.service;

import com.xu.entity.User;

import java.util.List;

public interface IUserService {
    User queryOne(Integer id);

    List<User> queryAll();

    int addUser(User user);

    int modifyUser(User user);

    int deleteUser(Integer id);

}
