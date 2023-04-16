/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.RestExample.springbootcrudoperation.repository;

import com.RestExample.springbootcrudoperation.entity.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ULTCPU20
 */
@Repository
public interface BooksRepository extends CrudRepository<Books, Long> {

}
