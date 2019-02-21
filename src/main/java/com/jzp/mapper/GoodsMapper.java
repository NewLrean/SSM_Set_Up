package com.jzp.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jzp.po.Goods;


@Repository
public interface GoodsMapper {
	 List<Goods> findAllGoods();
}
