package com.example.demo.mesc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.BookMark;
import com.example.demo.repo.GetBookMarkRepo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataInitialializer implements CommandLineRunner{

	@Autowired
	GetBookMarkRepo bookmarkRepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookmarkRepo.save(new BookMark("https://www.google.com/book"," Google"));
		bookmarkRepo.save(new BookMark("https://www.ud.com/bounce-rate-firebase-golang/V"," Google"));
		bookmarkRepo.save(new BookMark("https://www.ud.com/responsive-bitbucket-backend/G"," Google"));
		//bookmarkRepo.save(new BookMark(103l,"https://www.ud.com/link-building-heroku-server/k"," Google"));
		/*
		 * bookmarkRepo.save(new BookMark(104l,
		 * "https://www.ud.com/postgresql-accessibility-analytics/V"," Google"));
		 * bookmarkRepo.save(new BookMark(105l,
		 * "https://www.ud.com/jenkins-affiliate-marketing-gitlab/x"," Google"));
		 * bookmarkRepo.save(new
		 * BookMark(106l,"https://www.ud.com/sitemap-kubernetes-performance/T"," Google"
		 * )); bookmarkRepo.save(new
		 * BookMark(107l,"https://www.ud.com/laravel-aspnet-digitalocean/T"," Google"));
		 * bookmarkRepo.save(new
		 * BookMark(108l,"https://www.ud.com/mysql-sitemap-gcp/J"," Google"));
		 * bookmarkRepo.save(new
		 * BookMark(109l,"https://www.ud.com/docker-css-vercel/x"," Google"));
		 * bookmarkRepo.save(new
		 * BookMark(110l,"https://www.ud.com/python-jquery-golang/K"," Google"));
		 * bookmarkRepo.save(new
		 * BookMark(111l,"https://www.ud.com/laravel-aspnet-digitalocean/T"," Google"));
		 */
		System.out.println(".. data Loaded successully ..");
	}

}
