package com.example.demo.wrapper;

import org.springframework.stereotype.Component;

@Component
public class BookDTO 
{
	
	String bookMarkUrl;
	String title;
	public BookDTO() {}
	public BookDTO(Long bookMarkID, String bookMarkUrl, String title) 
	{
		
		this.bookMarkUrl = bookMarkUrl;
		this.title = title;
	}


	public String getBookMarkUrl() {
		return bookMarkUrl;
	}
	public void setBookMarkUrl(String bookMarkUrl) {
		this.bookMarkUrl = bookMarkUrl;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "BookMark [ bookMarkUrl=" + bookMarkUrl + ", title=" + title + "]";
	}
	
}
