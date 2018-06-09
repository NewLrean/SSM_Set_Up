package com.jzp.service.impl;

import com.jzp.mapper.UserMapper;
import com.jzp.po.User;
import com.jzp.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/6.
 */

@Service
public class UserServiceImpl  implements UserService{


    @Resource
    private UserMapper iUserDao;


    @Override
    public void saveUser(User user) {

        iUserDao.saveUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return iUserDao.updateUser(user);
    }

    @Override
    public boolean deleteUser(String id) {
        return iUserDao.deleteUser(id);
    }

    @Override
    public User queryUserById(String id) {
        return iUserDao.queryUserById(id);
    }


    @Override
    public List<User> queAllUser() {
        return iUserDao.queryAllUser();
    }

    @Override
    public User selectBylogin(String username, String password) {
        return iUserDao.selectBylogin(username,password);
    }


}
