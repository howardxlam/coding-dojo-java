package com.codingdojo.loginreg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.loginreg.models.Book;
import com.codingdojo.loginreg.services.BookService;

import jakarta.validation.Valid;

@Controller 
@RequestMapping ("/books")
public class BookController {
	
	private final BookService bookService;
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	
	@GetMapping("/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "book/create.jsp";
	}
	
	@PostMapping("/process/new")
	public String processCreateBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		
		if (result.hasErrors()) {
			System.out.println(result);
			return "book/create.jsp";
		} else {
			bookService.create(book);
			return "redirect:/";
		}
	}
	
	@GetMapping("/{id}")
	public String deatil(@PathVariable("id") Long id, Model model) {
	    Book book = bookService.findBook(id);
	    model.addAttribute("book", book);
	    return "/book/detail.jsp";
	}
	
	@GetMapping("/{id}/edit")
	public String show(@PathVariable("id") Long id, Model model) {
	    Book book = bookService.findBook(id);
	    model.addAttribute("book", book);
	    return "book/edit.jsp";
	}
	
	@PutMapping("/{id}/update")
	public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, @PathVariable("id") Long id, Model model) {
	    if(result.hasErrors()) {
	        model.addAttribute("book", book);
	        return "book/edit.jsp";
	    }
	    bookService.updateBook(book);
	    return "redirect:/";
	}
			
    @DeleteMapping("/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return "redirect:/";
    }


}