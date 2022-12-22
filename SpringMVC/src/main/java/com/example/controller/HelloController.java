package com.example.controller;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.models.User;
import com.examples.dao.UserRepository;

@Controller
public class HelloController {

	@Autowired
	@Qualifier(value = "userRepository")
	UserRepository userRepository;
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String userform() {
		System.out.println("Userform");
		return "userform";
	}
	
	@RequestMapping(value = "/userform",method = RequestMethod.GET)
	public String userform(Model model) {
		model.addAttribute("user", new User());
		return "userform";
	}
	@RequestMapping(value = "/savedata",method = RequestMethod.POST)
	public String savedata(@ModelAttribute("user") User user, Model model) {
		int i=userRepository.add(user);
		System.out.println("Value of i="+i);
		model.addAttribute("user", user);
		return "userdata";
	}
}
