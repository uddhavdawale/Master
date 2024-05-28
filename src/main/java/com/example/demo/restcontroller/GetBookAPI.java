package com.example.demo.restcontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BookMarkDTO;
import com.example.demo.model.BookMark;
import com.example.demo.model.BookMarkRequest;
import com.example.demo.serveice.BookMarkService;
import com.example.demo.wrapper.BookDTO;

@RestController
@RequestMapping("/bookmark")
public class GetBookAPI 
{
	@Autowired
	BookMarkService bookmarkservice;
	
	@GetMapping("/h")// replace with post mapping ..
	public ResponseEntity<BookMark> validateUserLogin()
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		ResponseEntity<BookMark> responseEntity=  new ResponseEntity<>(new BookMark(),responseHeaders,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/get")
	@ResponseBody
	public BookMarkDTO getBookMark(@RequestParam(value="page", defaultValue = "0")  String pageNO)
	{
		System.out.println(Integer.valueOf(pageNO));
		BookMarkDTO page= bookmarkservice.getList(Integer.valueOf(pageNO));
		System.out.println(page.toString());
		 return page;
	}
	
	/*
	 * @GetMapping("/g") public ResponseEntity< List<Object>> gett() { List<Object>
	 * list=new ArrayList<>(); list.add("abcd"); list.add("mnop");
	 * list.add(bookmarkservice.getList()); // return " welcome "+new
	 * ArrayList<String >(12); return ResponseEntity.ok(list); }
	 */
	
	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.CREATED)
	public BookDTO getBookmarkData(@RequestBody @Valid BookMarkRequest request)
	{
		return bookmarkservice.saveBookMark(request);
		/*
		 * System.out.println(response); return response;
		 */
	}
}
