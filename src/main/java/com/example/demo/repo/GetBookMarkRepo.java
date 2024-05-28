package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BookMark;

@Repository
public interface GetBookMarkRepo extends JpaRepository<BookMark,Long> 
{
	

}
