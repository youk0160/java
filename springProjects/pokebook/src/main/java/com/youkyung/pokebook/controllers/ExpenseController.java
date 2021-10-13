package com.youkyung.pokebook.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.youkyung.pokebook.models.Expense;
import com.youkyung.pokebook.services.ExpenseService;

@Controller
public class ExpenseController {
	private final ExpenseService expService;
    
    public ExpenseController(ExpenseService expService) {
        this.expService = expService;
    }
    
    @RequestMapping("/expenses")
    public String index(@ModelAttribute("expense") Expense exp, Model model) {
        List<Expense> exps = expService.allExps();
        model.addAttribute("exps", exps);
        return "index.jsp";
    }
    
    @RequestMapping("/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        expService.deleteExp(id);
        return "redirect:/expenses";
    }
    

    
    @RequestMapping("/expenses/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
    	Expense exp = expService.findExp(id);
    	model.addAttribute("exp", exp);
    	return "show.jsp";
    }
    
    @RequestMapping(value="/submit", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("expense") Expense exp, BindingResult result) {
    	if (result.hasErrors()) {
            return "index.jsp";
        } else {
            expService.createExp(exp);
            return "redirect:/expenses";
        }
    }
    
    @RequestMapping("/expenses/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Expense exp = expService.findExp(id);
    	model.addAttribute("exp", exp);
        return "edit.jsp";
    }
        
    @RequestMapping(value="/edit/{id}", method=RequestMethod.PUT)
    public String editing(@Valid @ModelAttribute("exp") Expense expense, BindingResult result) {
    	if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            expService.updateExp(expense);
            return "redirect:/expenses";
        }
    }
}
