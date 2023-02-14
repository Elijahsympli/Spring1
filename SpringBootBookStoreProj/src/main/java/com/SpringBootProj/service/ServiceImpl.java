package com.SpringBootProj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootProj.dto.BookDTO;
import com.SpringBootProj.exception.BUNotFoundException;
import com.SpringBootProj.model.Books;
import com.SpringBootProj.repository.BookRepository;

@Service
public  class ServiceImpl implements Services {
@Autowired
private BookRepository bookrepository;
List<Books> list1=new ArrayList<>();



@Override
public List<Books> getBooks() {
	int ck=0;
	// TODO Auto-generated method stub
	for(Books b:bookrepository.findAll()) 
	ck++;
	if(ck!=0)
	return bookrepository.findAll();
	else
		throw new BUNotFoundException("NO DATA PRESENT");

}

@Override
public List<Books> getBooksByAuthor(String bk_athr) {
	Books book=null;
	int ck=0;
	List<Books> list1=new ArrayList<>();
	for(Books b:bookrepository.findAll()) {
		if(b.getBk_athr().equals(bk_athr)) {
			book=b;
			list1.add(book);
			ck++;
		}
	}//		return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("No user by ID: " + id));

	if(ck!=0)
	return list1;
	else 
		throw new BUNotFoundException("Book with the author name:"+bk_athr+" not found");
}
/*
 * User user = User.builder().name(userRequest.getName()).email(userRequest.getEmail())
				.mobile(userRequest.getMobile()).age(userRequest.getAge()).build();
		
 */


@Override
public Books updateBook(Books obj) {
	// TODO Auto-generated method stub
	bookrepository.save(obj);
	return obj;
}

@Override
public String deleteBook(int id) {
	int ck=0;
	for(Books b:bookrepository.findAll()) {
	bookrepository.deleteById(id);
	ck++;
	}
	if(ck!=0)
		return "Book by id "+id+" deleted successfully";

	else 
		throw new BUNotFoundException("there is no book with the id:"+id+" ");

	
}

@Override
public List<Books> getByBookName(String bk_name) {
	Books book=null;
	int ck=0;
	List<Books> list1=new ArrayList<>();
	for(Books b:bookrepository.findAll()) {
		if(b.getBk_name().equals(bk_name)) {
			book=b;
			list1.add(book);
			ck++;
		}
	}
	if(ck!=0)
		return list1;
		else 
			throw new BUNotFoundException("there is no book with the name:"+bk_name+" ");

}

@Override
public List<Books> getByPriceUnder(int price) {
	Books book=null;
	int ck=0;
	List<Books> list1=new ArrayList<>();
	for(Books b:bookrepository.findAll()) {
		if(price>b.getPrice())  {
			book=b;
			list1.add(book);
			ck++;
		}
	}
	if(ck!=0)
	return list1;
	else 
		throw new BUNotFoundException("there is no book under price:"+price+" ");
}


public Books addBook(BookDTO bookdto) {
	Books books=Books.builder().bk_name(bookdto.getBk_name()).bk_athr(bookdto.getBk_athr()).
			price(bookdto.getPrice()).Total_pages(bookdto.getTotal_pages()).isbn(bookdto.getIsbn())
			.publisher_nm(bookdto.getPublisher_nm()).published_dt(bookdto.getPublished_dt()).build();

	return bookrepository.save(books);
}


	

}