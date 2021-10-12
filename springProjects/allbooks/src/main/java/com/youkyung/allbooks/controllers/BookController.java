package com.youkyung.allbooks.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youkyung.allbooks.models.Book;
import com.youkyung.allbooks.services.BookService;

@Controller
public class BookController {
    private final BookService bookService;
    
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
//    	Book book = new Book("Anna Karenina", "sdkjfsdlkjfksldfsdfsdfsdf", "Russian", 823);
//    	bookService.createBook(book);
    	
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "/books/index.jsp";
    }
}
