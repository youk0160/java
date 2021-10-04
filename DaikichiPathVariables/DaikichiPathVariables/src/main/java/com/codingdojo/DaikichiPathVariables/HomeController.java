package com.codingdojo.DaikichiPathVariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	 public String hello() {
		return "hello";
	}
	
	@RequestMapping("/daikichi/travel/{city}")
    public String travelWhere(@PathVariable("city") String city){
    	return "Congratulations! You will soon travel to " + city + "!";
    }
	
	@RequestMapping("/daikichi/lotto/{num}")
    public String lottoNum(@PathVariable("num") String num){
		if(num.length()%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers"; 
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
    }
}
