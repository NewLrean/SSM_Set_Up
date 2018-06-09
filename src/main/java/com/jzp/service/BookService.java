package com.jzp.service;

import com.jzp.po.Book;
import com.jzp.po.User;

import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/8.
 */

public interface BookService{
    List<Book> findAllBook();
}
