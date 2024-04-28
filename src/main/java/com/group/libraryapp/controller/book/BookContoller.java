package com.group.libraryapp.controller.book;


import com.group.libraryapp.service.book.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookContoller {

    private final BookService bookService;

    public BookContoller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public void saveBook(){
        bookService.saveBook();
    }
}
