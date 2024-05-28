package com.example.demo.wrapper;

import org.springframework.stereotype.Component;

import com.example.demo.model.BookMark;

@Component
public class BooKWrapperDTO 
{
	public BooKWrapperDTO()
	{
		
	}
	
	public	BookDTO toDTO(BookMark bookmark)
	{
	BookDTO bookdtow=new BookDTO();
		try
		{ Long id=bookmark.getBookMarkID();
			
			bookdtow.setTitle(bookmark.getTitle());
			bookdtow.setBookMarkUrl(bookmark.getBookMarkUrl());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(" e **"+e);
		}
		return bookdtow;
	}
}
