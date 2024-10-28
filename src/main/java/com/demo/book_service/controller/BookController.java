package com.demo.book_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.book_service.dao.BookRepository;
import com.demo.book_service.model.Book;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookRepository bookRepo;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return this.bookRepo.findAll();
	}
	
	@GetMapping("/books/{bid}")
	public Book getABooks(@PathVariable int bid) {
		return this.bookRepo.findById(bid).get();
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book newBook) {
		return this.bookRepo.save(newBook);
	}

	@PutMapping("update")
	public Book updateBook(@RequestBody Book b){
		return bookRepo.save(b);
	}

	@DeleteMapping("delete/{id}")
	public void deleteBook(@PathVariable int id){
//		Optional<Book> b=bookRepo.findById(id);
		if(bookRepo.existsById(id)){
			bookRepo.deleteById(id);
		}

	}

	@GetMapping("authorbooks/{bookAuthurId}")
	public List<Book> getAuthorBooks(@PathVariable String bookAuthurId){
		List<Book> l=bookRepo.findByBookAuthurId(bookAuthurId);
		return l;
	}
}
