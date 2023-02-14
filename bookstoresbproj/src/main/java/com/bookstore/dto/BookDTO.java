package com.bookstore.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class BookDTO {
	@NotBlank(message = "Invalid Name: Empty name")
	@NotNull(message = "Invalid Name: Name is NULL")
	
	private String bk_name;
	@NotBlank(message = "Invalid author Name: Empty author Name")
	@NotNull(message = "Invalid author Name: book author is NULL")
	private String bk_athr;

	@NotNull(message = "Invalid price: price is NULL")
	private Integer price;
	private String isbn;
	private String published_dt;
	private String publisher_nm;
    private int Total_pages;


}
