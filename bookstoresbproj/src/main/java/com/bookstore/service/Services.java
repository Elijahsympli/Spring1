package com.bookstore.service;

import java.util.List;

import com.bookstore.dto.BookDTO;
import com.bookstore.model.Books;


public interface Services {


List<Books> getBooks();

List<Books> getBooksByAuthor(String bk_athr);
List<Books> getByBookName(String bk_athr);

Books addBook(BookDTO bookdto);
Books updateBook(Books obj);
 String deleteBook(int id);

List<Books> getByPriceUnder(int price);

}
