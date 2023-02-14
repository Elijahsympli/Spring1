package com.SpringBootProj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootProj.model.Books;


public interface BookRepository extends JpaRepository<Books, Integer> {

}
