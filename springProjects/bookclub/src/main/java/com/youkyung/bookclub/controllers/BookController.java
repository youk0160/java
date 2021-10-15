package com.youkyung.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.youkyung.bookclub.models.Book;
import com.youkyung.bookclub.services.BookService;

@Controller
public class BookController {
	@Autowired
    private BookService bookServ;
	
	@GetMapping("/books/new")
    public String newBook(@ModelAttribute("newBook") Book book, Model model, HttpSession session) {
    	if(session.getAttribute("user_id")== null) return "redirect:/dashboard";
    	Long userID = (Long)session.getAttribute("user_id");
    	model.addAttribute("user_id", userID);
    	return "addBook.jsp";
    }
	
	@PostMapping("/books/create")
    public String createBook(@Valid @ModelAttribute("newBook") Book book, 
            BindingResult result) {
        if(result.hasErrors()) {
        	return "addBook.jsp";
        }
        bookServ.createBook(book);
        return "redirect:/dashboard";
    }
	
	@GetMapping("/books/{id}")
	public String displayBook(@PathVariable("id") Long id, Model model) {
		Book book =bookServ.findBook(id);
        model.addAttribute("book", book);
    	return "book.jsp";
    }
	@GetMapping("/books/{id}/edit")
	public String editBook(@PathVariable("id") Long id, Model model) {
		Book book =bookServ.findBook(id);
        model.addAttribute("book", book);
    	return "editBook.jsp";
    }
	
	@PutMapping("/books/edit/{id}")
    public String updateBook(@Valid @ModelAttribute("book") Book book, 
            BindingResult result) {
        if(result.hasErrors()) {
        	return "editBook.jsp";
        }
        bookServ.updateBook(book);
        return "redirect:/dashboard";
    }
	
}
