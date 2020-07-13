package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookService;
import com.example.demo.data.BookData;

@RestController
@RequestMapping("/api")
public class Controller {



	@Autowired
	BookService bs;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<BookData> searchAll() {

		return bs.searchBookData();
	}

	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@PostMapping
	public void register(@RequestParam("id") Integer bookNo, @RequestParam("bookname") String bookName,
			@RequestParam("price") int price) {

		BookData data = new BookData(bookNo, bookName, price);

		bs.insertBookData(data);

	}

}
