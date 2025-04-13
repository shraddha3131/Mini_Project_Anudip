package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.model.Book;
import com.demo.repository.BookRepository;

@RestController
public class LibraryController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @PostMapping("/addbook")
    public Book addBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }
}