package com.example.demo.data;

import lombok.Data;

/**
 * 書籍データクラス
 */
@Data
public class BookData {

	/** 書籍ID */
	private Integer bookNo;

	/** 書籍名 */
	private String bookName;

	/** 値段 */
	private Integer price;

	public BookData() {

		}

	public BookData(Integer bookNo, String bookName, Integer price) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.price = price;
	}



//	@Override
//	public String toString() {
//		return "BookData [bookNo=" + bookNo + ", bookName=" + bookName + ", price=" + price + "]";
//	}










}
