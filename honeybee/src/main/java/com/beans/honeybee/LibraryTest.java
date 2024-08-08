package com.beans.honeybee;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("library.xml");
		Library lib =(Library)context.getBean("lib");
		List<Book>books = lib.getBooks();
		for(Book b:books) {
			System.out.println(b);
		}
	}

}