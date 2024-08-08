package com.beans.honeybee;

import java.util.List;

public class Library {
	private List<Book> books;// property

	public List<Book> getBooks() {
		return books;
	}

	// setter injuction
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}