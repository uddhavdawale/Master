package com.example.demo.model;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookMarkRequest
{
  @NotEmpty(message = "url should not empty")
    String uRL;
  @NotEmpty(message = "Title Should not be empty ")
    String title;
  
  public BookMarkRequest() {}
  public BookMarkRequest(@NotEmpty(message = "url should not empty") String uRL,
			@NotEmpty(message = "Title Should not be empty ") String title,
			@NotEmpty(message = "Id Should not be the empty ") Long id) {
		super();
		this.uRL = uRL;
		this.title = title;
	}
  
	public String getuRL() {
		return uRL;
	}
	public void setuRL(String uRL) {
		this.uRL = uRL;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}  
	  
}
