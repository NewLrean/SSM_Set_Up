package com.jzp.mapper;

import com.jzp.po.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/6.
 */

@Repository
public interface UserMapper {
    void saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(String id);

    User queryUserById(String id);

    List<User> queryAllUser();

    User selectBylogin(String username,String password);
}
