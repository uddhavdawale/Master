package com.example.demo;

import java.util.List;

import org.springframework.data.domain.Page;
import com.example.demo.model.BookMark;
import com.example.demo.wrapper.BookDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
public class BookMarkDTO 
{
	private List<BookDTO> data;
	private long totalElement;
	private int totalPage;
	private int currentPage;
	@JsonProperty("IsFirst")
	private boolean isFirst;
	@JsonProperty("IsLast")
	private boolean isLast;
	private boolean hasNext;
	private boolean hasPrevious;
	public BookMarkDTO(Page<BookDTO> bookmarhpage)
	{
		this.setData(bookmarhpage.getContent());
		this.setTotalElement(bookmarhpage.getTotalElements());
		this.setTotalPage(bookmarhpage.getTotalPages());
		this.setFirst(bookmarhpage.isFirst());
		this.setLast(bookmarhpage.isLast());
		this.setHasNext(bookmarhpage.hasNext());
		this.setHasPrevious((bookmarhpage.hasPrevious()));
	}
	public List<BookDTO> getData() {
		return data;
	}
	public void setData(List<BookDTO> data) {
		this.data = data;
	}
	public long getTotalElement() {
		return totalElement;
	}
	public void setTotalElement(long l) {
		this.totalElement = l;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public boolean isFirst() {
		return isFirst;
	}
	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}
	public boolean isLast() {
		return isLast;
	}
	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}
	public boolean isHasNext() {
		return hasNext;
	}
	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	public boolean isHasPrevious() {
		return hasPrevious;
	}
	public void setHasPrevious(boolean hasPrevious) {
		this.hasPrevious = hasPrevious;
	}
	
}
