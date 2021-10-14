package com.youkyung.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.youkyung.dojosninjas.models.Ninja;
import com.youkyung.dojosninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	// returns all the books
    public List<Ninja> allNinjas() {
        return ninjaRepo.findAll();
    }
    // creates a book
    public Ninja createNinja(Ninja b) {
        return ninjaRepo.save(b);
    }
    // retrieves a book
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    // update a book
    public Ninja updateNinja(Ninja b) {
        return ninjaRepo.save(b);
    }
    //delete a book
    public void deleteNinja(Long id) {
    	ninjaRepo.deleteById(id);
    }
}
