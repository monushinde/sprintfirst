package com.example.BookStoreManagementt.model;

import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

@id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public class bookmodel {
	private Long id;
	@Column(name="BookName",nullable=false)
	private String BookName; 
	public bookmodel(String bookName, String authorName, Long price) {
		super();
		BookName = bookName;
		AuthorName = authorName;
		this.price = price;
	}
	@Column(name="Author")
	private String AuthorName;
	@Column(name="price")
	private Long price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

}
