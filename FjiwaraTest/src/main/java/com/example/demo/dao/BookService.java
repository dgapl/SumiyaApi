package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.data.BookData;

@Transactional
@Service
public class BookService {

	@Autowired
	TestMapper tm;

	public List<BookData> searchBookData() {

		List<BookData> list = new ArrayList<BookData>();

		list = tm.getAll();

		return list;
	}

	public void insertBookData(BookData data) {

		tm.regist(data.getBookNo(), data.getBookName(), data.getPrice());

	}

}
