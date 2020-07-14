package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.data.BookData;

@Mapper
public interface TestMapper {

	// 全件選択
	List<BookData> getAll();

	//書籍登録に使用
	int MaxId();

	// 1件挿入
	void regist(@Param("id") Integer id, @Param("bookname") String bookname, @Param("price") Integer price);

}
