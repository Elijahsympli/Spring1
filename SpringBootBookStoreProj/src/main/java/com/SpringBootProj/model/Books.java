package com.SpringBootProj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;

@Entity
@Builder
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private	Integer id;
	@Column
	
	private String bk_name;
	@Column
    private int Total_pages;
	@Column(length =20,nullable=false)
	private String isbn;
	@Column(length =20,nullable=false)
	private String publisher_nm;
	@Column(length =20,nullable=false)
	private String published_dt;
	
	@Column(length =20,nullable=false)
	
	private String bk_athr;
	@Column
	private Integer price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public int getTotal_pages() {
		return Total_pages;
	}
	public void setTotal_pages(int total_pages) {
		Total_pages = total_pages;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher_nm() {
		return publisher_nm;
	}
	public void setPublisher_nm(String publisher_nm) {
		this.publisher_nm = publisher_nm;
	}
	public String getPublished_dt() {
		return published_dt;
	}
	public void setPublished_dt(String published_dt) {
		this.published_dt = published_dt;
	}
	public String getBk_athr() {
		return bk_athr;
	}
	public void setBk_athr(String bk_athr) {
		this.bk_athr = bk_athr;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(Integer id, String bk_name, int total_pages, String isbn, String publisher_nm, String published_dt,
			String bk_athr, Integer price) {
		super();
		this.id = id;
		this.bk_name = bk_name;
		Total_pages = total_pages;
		this.isbn = isbn;
		this.publisher_nm = publisher_nm;
		this.published_dt = published_dt;
		this.bk_athr = bk_athr;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", bk_name=" + bk_name + ", Total_pages=" + Total_pages + ", isbn=" + isbn
				+ ", publisher_nm=" + publisher_nm + ", published_dt=" + published_dt + ", bk_athr=" + bk_athr
				+ ", price=" + price + "]";
	}
	
	
	
}
