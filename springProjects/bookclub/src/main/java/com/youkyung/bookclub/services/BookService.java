package com.youkyung.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.youkyung.bookclub.models.Book;
import com.youkyung.bookclub.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;

	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	// returns all the books
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    //update a book
    public Book updateBook(Book b) {
    	return bookRepo.save(b);
    }
    // delete a book
    public void deleteBook(Long id) {
    	bookRepo.deleteById(id);
    }
}
