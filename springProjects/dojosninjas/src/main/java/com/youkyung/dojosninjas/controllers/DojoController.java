package com.youkyung.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.youkyung.dojosninjas.models.Dojo;
import com.youkyung.dojosninjas.services.DojoService;

public class DojoController {
	private final DojoService dojoService;
    
    public DojoController(DojoService dojoService) {
        this.dojoService = dojoService;
    }
    
    @RequestMapping("/")
    public String index(Model model) {
    	List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
    	return "index.jsp";
    }
    @RequestMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "newDojo.jsp";
    }
    
    @RequestMapping(value="/createDojo", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
    	if (result.hasErrors()) {
            return "newDojo.jsp";
        } else {
            dojoService.createDojo(dojo);
            return "redirect:/expenses";
        }
    }
//    @RequestMapping("/delete/{id}")
//    public String destroy(@PathVariable("id") Long id) {
//        dojoService.deleteDojo(id);
//        return "redirect:/expenses";
//    }
}
