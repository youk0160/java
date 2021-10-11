package com.youkyung.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/submit")
	public String submit(
		HttpSession session,
	    @RequestParam(value="number") String num,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="fullName") String name,
	    @RequestParam(value="hobby") String hobby,
	    @RequestParam(value="living") String living,
	    @RequestParam(value="fortune") String fortune) {
		
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("fortune", fortune);
	    return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/show")
	public String show(HttpSession session, Model model) {
		model.addAttribute("num", session.getAttribute("num"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("living", session.getAttribute("living"));
		model.addAttribute("fortune", session.getAttribute("fortune"));
		return "show.jsp";
	}
}
