package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.repo.GetBookMarkRepo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) 
// it will use random port what will be available at config side
@AutoConfigureMockMvc // to fire a API call
public class BookMarkControllerAPITest 
{
	@Autowired
	MockMvc mvc;
	@Autowired
	GetBookMarkRepo repo;
	@Before
	public void BeforeTest()
	{
		repo.deleteAll();
	}
	
	@Test
	public void t1() throws Exception
	{
		mvc.perform( get("/bookmark/get?page=2")).
		andExpect(jsonPath("$.totalElement", CoreMatchers.equalTo(3)));
		System.out.println(" Changes has been done ..");
	}
	
	@Test
	public void getBookmarkDataTest() throws Exception
	{
		mvc.perform(post("/bookmark/save").contentType(MediaType.APPLICATION_ATOM_XML.APPLICATION_JSON)
				.content("""
						{
            "uRL": "https://www.google.com/book/ert",
            "title": "Title2"
}
						"""
						)
				).andExpect(status().isCreated());
	}
}
