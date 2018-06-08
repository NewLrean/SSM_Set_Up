package com.jzp.dao;

import com.jzp.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/6.
 */

@Repository
public interface IUserDao {
    void saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(String id);

    User queryUserById(String id);

    List<User> queryAllUser();

    User selectBylogin(String username,String password);
}
