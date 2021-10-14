package com.youkyung.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.youkyung.dojosninjas.models.Dojo;
import com.youkyung.dojosninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	// returns all the books
    public List<Dojo> allDojos() {
        return dojoRepo.findAll();
    }
    // creates a book
    public Dojo createDojo(Dojo b) {
        return dojoRepo.save(b);
    }
    // retrieves a book
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
    // update a book
    public Dojo updateDojo(Dojo b) {
        return dojoRepo.save(b);
    }
    //delete a book
    public void deleteDojo(Long id) {
    	dojoRepo.deleteById(id);
    }
}
