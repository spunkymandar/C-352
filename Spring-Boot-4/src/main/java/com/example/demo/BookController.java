package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping("/getbook/{id}")
	public Optional<Book> findById(@PathVariable("id") Long id) throws BookNotFoundException {
		Optional<Book> b= service.findById(id);
		if(!b.isPresent())
			throw new BookNotFoundException(("id="+id));
		return b;
	}

}
