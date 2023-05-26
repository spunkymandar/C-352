package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot4Application implements CommandLineRunner{

	@Autowired
	BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookRepository.save(new Book("Thinking in Java","483748"));
		bookRepository.save(new Book("Java 9 to 17","45738"));
		bookRepository.save(new Book("Java Interview prep","857385"));
		System.out.println("Books added successfully ");
		
		for(Book book:bookRepository.findAll())
			System.out.println(book);
		
		Book b=bookRepository.findById(1L).get();
		System.out.println("Book with id 1L :"+ b);
		
		Book bookJava=bookRepository.findByTitle("Thinking in Java");
		System.out.println(bookJava);
		
		List<Book> javaBooks=bookRepository.findByTitleStartingWith("Java");
		System.out.println(javaBooks);
		
		List<Book> bookList1=bookRepository.findByTitleEndsWith("ep");
		System.out.println(bookList1);
		
		
		List<Book> booksorted =bookRepository.findbookTitleAscending();
		System.out.println(booksorted);
		
	}

}
