package com.youkyung.pokebook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.youkyung.pokebook.models.Expense;
import com.youkyung.pokebook.repositories.ExpenseRepository;

@Service
public class ExpenseService {
private final ExpenseRepository expRepo;
	
	public ExpenseService(ExpenseRepository expRepo) {
		this.expRepo = expRepo;
	}
	
	// returns all the books
    public List<Expense> allExps() {
        return expRepo.findAll();
    }
    // creates a book
    public Expense createExp(Expense b) {
        return expRepo.save(b);
    }
    // retrieves a book
    public Expense findExp(Long id) {
        Optional<Expense> optionalBook = expRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    //update a book
    public Expense updateExp(Expense b) {
    	return expRepo.save(b);
    }
    // delete a book
    public void deleteExp(Long id) {
    	expRepo.deleteById(id);
    }
}
