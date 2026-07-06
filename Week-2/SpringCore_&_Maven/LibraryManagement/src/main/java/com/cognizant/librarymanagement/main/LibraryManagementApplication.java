package com.cognizant.librarymanagement.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.librarymanagement.service.BookService;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService service = context.getBean("bookService", BookService.class);
            service.displayService();
        }
    }
}
