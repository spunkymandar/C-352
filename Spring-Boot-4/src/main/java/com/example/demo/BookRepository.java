package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> { //BookRepositoryImpl

	//Optional<T> findById(ID id);
	
	Book findByTitle(String title);
	
	List<Book> findByTitleIs(String title);
	List<Book> findByTitleEquals(String title);
	List<Book> findByTitleIsNot(String title);
	
	List<Book> findByTitleStartingWith(String prefix);
	
	//Book findByPriceLessThan(Integer value);
	//Book findByPriceBetween(Integer value1, Integer value2);
	
	//List<Book> findByTitleOrderBy(String name);
	
	
	
	//@Query("select * from book where title LIKE %?1")
	//@Query("select * from book where title LIKE %?1",nativeQuery = true)
	//@Query(value = "select * from book where title LIKE %?1", nativeQuery = true)
	@Query("select b from Book b where b.title LIKE %?1")//JPQL
	List<Book> findByTitleEndsWith(String chars);
	
	
	//List<Employee> findTop3ByAge()
	
	List<Book> findbookTitleAscending();
	
}

