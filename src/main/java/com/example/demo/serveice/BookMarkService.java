package com.example.demo.serveice;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.BookMarkDTO;
import com.example.demo.model.BookMark;
import com.example.demo.model.BookMarkRequest;
import com.example.demo.repo.GetBookMarkRepo;
import com.example.demo.wrapper.BooKWrapperDTO;
import com.example.demo.wrapper.BookDTO;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookMarkService 
{
	@Autowired
	GetBookMarkRepo getbookmark;
	
	@Autowired
	BooKWrapperDTO bookMarkWrapper;;
	
	@Transactional()
	public BookMarkDTO getList(int page)
	{
		int pageNo= page<=0?0:page-1;
	
		org.springframework.data.domain.Pageable pageable=PageRequest.of(pageNo,3);
		// here me can not return direct entity to client 
		//solution : DTO Projection
		Page<BookDTO> page1=getbookmark.findAll(pageable).map(i->bookMarkWrapper.toDTO(i));
		//return new BookMarkDTO(getbookmark.findAll(pageable));
		System.out.println(page1);
		return new BookMarkDTO(page1);
	}

	public BookDTO saveBookMark(@Valid BookMarkRequest bookmark) {
		// TODO Auto-generated method stub
	//	BookMark bm	new BookMark(100l,"https://www.google.com/book"," Google");
		BookMark bm=new BookMark(bookmark.getuRL(), bookmark.getTitle());
		System.out.println(bm+"*******");
		BookDTO bookdto= bookMarkWrapper.toDTO(getbookmark.save(bm));
		return bookdto;
	}
	

}
