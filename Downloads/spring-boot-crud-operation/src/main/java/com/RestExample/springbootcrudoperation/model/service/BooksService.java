/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RestExample.springbootcrudoperation.model.service;

import com.RestExample.springbootcrudoperation.entity.Books;

import com.RestExample.springbootcrudoperation.repository.BooksRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ULTCPU20
 */
@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    //getting all books record by using the method findaAll() of CrudRepository  
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }
//getting a specific record by using the method findById() of CrudRepository  

    public Books getBooksById(Long id) {
        return booksRepository.findById(id).get();
    }
//saving a specific record by using the method save() of CrudRepository  

    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }
//deleting a specific record by using the method deleteById() of CrudRepository  

    public void delete(Long id) {
        booksRepository.deleteById(id);
    }
//updating a record  

    public void update(Books books, int bookid) {
        booksRepository.save(books);
    }
}
