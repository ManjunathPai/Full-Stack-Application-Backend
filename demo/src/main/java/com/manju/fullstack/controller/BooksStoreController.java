package com.manju.fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manju.fullstack.dao.BooksStoreRepository;
import com.manju.fullstack.exceptions.ResourceNotFoundException;
import com.manju.fullstack.model.Book;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class BooksStoreController {

	@Autowired
	BooksStoreRepository repository;

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return repository.findAll();
	}
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book aBook) {
		return repository.save(aBook);
	}
	
	@GetMapping("/getBook/{id}")
	public Book getBook(@PathVariable long id) {
		
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Requested Book Not Found"));
	}
}
