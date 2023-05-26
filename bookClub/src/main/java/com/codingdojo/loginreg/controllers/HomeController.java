package com.codingdojo.loginreg.controllers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.loginreg.models.Book;
import com.codingdojo.loginreg.services.BookService;
import com.codingdojo.loginreg.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	private final UserService userServ;
	private final BookService bookServ;
	public HomeController(UserService userServ, BookService bookServ) {
		this.userServ = userServ;
		this.bookServ = bookServ;
	}
	
	@GetMapping("/")
	public String home(HttpSession session,Model model, @RequestParam(name="sort", required=false) String sort) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users/login/register";
		}
		
		List<Book> books = bookServ.getAll();

		
	    if (sort != null) {
	        switch (sort) {
	            case "title":
	                Collections.sort(books, Comparator.comparing(Book::getTitle));
	                break;
	            case "author":
	                Collections.sort(books, Comparator.comparing(Book::getAuthor));
	                break;
	        }
	    }
		
		model.addAttribute("booksFromMyController", books);
		model.addAttribute("loggedInUser",userServ.getUser((Long)session.getAttribute("user_id")));
		return "main/home.jsp";
	}

}