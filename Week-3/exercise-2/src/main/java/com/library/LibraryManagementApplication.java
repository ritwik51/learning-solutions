package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Spring injects BookRepository into BookService here
        BookService bookService = (BookService) context.getBean("bookService");

        // Test method
        bookService.addBook("Clean Code by Robert C. Martin");
    }
}
