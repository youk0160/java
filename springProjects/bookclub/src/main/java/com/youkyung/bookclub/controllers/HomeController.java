package com.youkyung.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.youkyung.bookclub.models.Book;
import com.youkyung.bookclub.services.BookService;

@Controller
public class HomeController {
	@Autowired
    private BookService bookServ;
	
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
    	if(session.getAttribute("user_id")==null) return "redirect:/";
        List<Book> books =bookServ.allBooks();
        model.addAttribute("books", books);
    	return "dashboard.jsp";
    }
    
}
