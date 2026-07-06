package com.cognizant.librarymanagement.service;

import com.cognizant.librarymanagement.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("Book Service is working...");
        bookRepository.displayRepository();
    }
}
