package com.codingdojo.loginreg.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.loginreg.models.Book;
import com.codingdojo.loginreg.repositories.BookRepository;
@Service
public class BookService {

private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<Book> getAll(){
		return bookRepository.findAll();
		}
	
	public Book create(Book book) {
		return bookRepository.save(book);
	}
	
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	
    public Book updateBook(Book book) {
    	return bookRepository.save(book);
    }
    
    public void deleteBook(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
    		bookRepository.deleteById(id);
    	}
    }
    
}