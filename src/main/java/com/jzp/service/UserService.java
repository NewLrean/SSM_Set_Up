package com.jzp.service;

import com.jzp.domain.User;

import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/6.
 */

public interface UserService {

    void saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(String id);

    User queryUserById(String id);

    List<User> queAllUser();

    User selectBylogin(String username,String password);
}
