package com.jzp.test;


import com.jzp.dao.IUserDao;
import com.jzp.domain.Book;
import com.jzp.domain.User;
import com.jzp.service.BookService;
import com.jzp.service.UserService;
import com.jzp.util.IdGenrtor;
import com.jzp.util.SecurityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/6.
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:spring-context.xml,classpath*:spring-context-jedis.xml")
@ContextConfiguration(locations = { "classpath*:/spring-mybatis.xml"})
public class TestUser {

    @Resource
    UserService userService;

    @Resource
    BookService bookService;

    @Test
    public void show(){
        List<User> users = userService.queAllUser();
        System.out.println(users);

    }

    @Test
    public void addUser(){
        User user=new User();
        user.setId(IdGenrtor.getGUID());
        user.setUsername("jokerad");
        user.setPassword(SecurityUtils.toMD5("123456"));
        user.setPhone("13455467849");
        userService.saveUser(user);
    }

    @Test
    public void delete(){
        boolean b =userService.deleteUser("N0N6BJSJV4UNTXNRB3LEREODEHT49IBJ_");
        System.out.println(b);
    }

    @Test
    public void findallbook(){
        List<Book> allBook = bookService.findAllBook();
        System.out.println(allBook.get(0));
        System.out.println(allBook.get(0).getCategory());
    }

}
