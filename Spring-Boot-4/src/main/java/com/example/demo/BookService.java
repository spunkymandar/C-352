package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository repository;
	
	@Autowired
	MyPagingRepository myPagingRepository;
	
	
	public List<Book> findPaginatedBooks(int pageNo, int pageSize){
		Pageable pageable= PageRequest.of(pageNo, pageSize);
		Page<Book> pageResult= myPagingRepository.findAll(pageable);
		return pageResult.toList();
		
	}
	
	//GetMapping("/books/{pageNo}/{pageSize}")
	
	
	
	public Iterable<Book> findAll() {
		return repository.findAll();
	}
	
	public Optional<Book> findById(Long id) {
		
			
		return repository.findById(id);
	}

}
