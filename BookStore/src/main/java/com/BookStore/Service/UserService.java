package com.BookStore.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.BookStore.entity.book;
import com.globallogic.BookStore.service.bookser;
@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	bookser bs;


	@GetMapping("/")
	public List<book> disbook()
	{
		return bs.display();
	}

	@PostMapping("/")
	public String addbook(@RequestBody book e)
	{
		return bs.addbook(e);
	}
	@PutMapping("/{id}")
	public void editbook(@PathVariable("id")long id) {
		
	}
}
