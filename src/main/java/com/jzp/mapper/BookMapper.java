package com.jzp.mapper;

import com.jzp.po.Book;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/8.
 */

@Repository
public interface BookMapper {

    List<Book> findAllBook();
}
