/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RestExample.springbootcrudoperation.controlller;

import com.RestExample.springbootcrudoperation.entity.Books;
import com.RestExample.springbootcrudoperation.model.service.BooksService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ULTCPU20
 */
@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("/book")
    private List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }
//creating a get mapping that retrieves the detail of a specific book  

    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid") Long bookid) {
//        return booksService.getBooksById(bookid);
        Books books = booksService.getBooksById(bookid);
        
        return books;
    }
//creating a delete mapping that deletes a specified book  

    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") Long bookid) {
        booksService.delete(bookid);
    }
//creating post mapping that post the book detail in the database  

    @PostMapping("/books")
    private Long saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }
//creating put mapping that updates the book detail   

    @PutMapping("/books")
    private Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }
}
