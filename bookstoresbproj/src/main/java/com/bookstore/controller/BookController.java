package com.bookstore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.dto.BookDTO;
import com.bookstore.model.Books;
import com.bookstore.service.Services;

@RestController
public class BookController {
@Autowired
private Services services;

@GetMapping("/books")//view all books
public List<Books> getBooks(){
	return services.getBooks();
}


@GetMapping("/bookauthor/{bk_athr}")//search by Author name
public List<Books> getBooksByAuthor(@PathVariable String bk_athr ){
	return services.getBooksByAuthor(bk_athr);
}

@GetMapping("/bookname/{bk_name}")//search by book name
public List<Books> getByBookName(@PathVariable String bk_name ){
	return services.getByBookName(bk_name);
}

@GetMapping("/bookpricebelow/{price}")//search by price under given price
public List<Books> getBy(@PathVariable int price ){
	return services.getByPriceUnder(price);
}

	@PostMapping("/book")
	public Books addBook(@RequestBody @Valid  BookDTO obj) {
		return services.addBook(obj);
	}
	
	@PutMapping("/book")//inserting
	public Books updateBook(@RequestBody Books obj) {
		return services.updateBook(obj);
	}
	
	@DeleteMapping(value ="/book/{id}")//search by book id
	public String deleteBook(@PathVariable int id) {
		return services.deleteBook(id);
	}
	
	
}
