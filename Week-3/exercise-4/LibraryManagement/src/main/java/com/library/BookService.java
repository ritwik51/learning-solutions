package com.library;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Spring DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("BookService: Adding book...");
        bookRepository.saveBook(title);
    }
}
