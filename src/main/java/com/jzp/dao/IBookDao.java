package com.jzp.dao;

import com.jzp.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/8.
 */

@Repository
public interface IBookDao {

    List<Book> findAllBook();
}
