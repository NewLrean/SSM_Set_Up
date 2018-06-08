package com.jzp.service.impl;

import com.jzp.dao.IUserDao;
import com.jzp.domain.User;
import com.jzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/6.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Resource
    private IUserDao iUserDao;


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
