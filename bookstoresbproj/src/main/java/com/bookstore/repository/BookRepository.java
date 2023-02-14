package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.model.Books;


public interface BookRepository extends JpaRepository<Books, Integer> {

}
