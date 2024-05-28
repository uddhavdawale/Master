package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "UD_BookMark")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class BookMark 
{
	@Id
	@Column(name= "bid")
	@SequenceGenerator(name = "bm_id_seq", sequenceName = "bm_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_seq" )
	Long BookMarkID;
	
	@Column(name = "url")
	String bookMarkUrl;
	
	@Column(name= "Title")
	String title;
	public BookMark() {}
	
	public BookMark(String bookMarkUrl, String title) 
	{
		
		this.bookMarkUrl = bookMarkUrl;
		this.title = title;
	}
	

	public Long getBookMarkID() {
		return BookMarkID;
	}

	public void setBookMarkID(Long bookMarkID) {
		BookMarkID = bookMarkID;
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
		return "BookMark [BookMarkID=" + BookMarkID + ", bookMarkUrl=" + bookMarkUrl + ", title=" + title + "]";
	}
	
	
}
