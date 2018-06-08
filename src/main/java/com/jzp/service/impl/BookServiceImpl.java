package com.jzp.service.impl;

import com.jzp.dao.IBookDao;
import com.jzp.domain.Book;
import com.jzp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/8.
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    IBookDao iBookDao;

    @Override
    public List<Book> findAllBook() {
        return iBookDao.findAllBook();
    }
}
