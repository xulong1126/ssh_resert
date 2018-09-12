package com.xu.service.impl;

import com.xu.dao.IUserDao;
import com.xu.entity.User;
import com.xu.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {

    private IUserDao userDao;
    private Integer id;

    @Override
    public User queryOne(Integer id) {
        return userDao.queryOne(id);
    }

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int modifyUser(User user) {
        return userDao.modifyUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userDao.deleteUser(id);
    }


    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
