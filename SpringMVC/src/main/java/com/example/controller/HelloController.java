package com.example.controller;

import java.net.http.HttpResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.models.User;

@Controller
public class HelloController {

	@RequestMapping(value = "/userform",method = RequestMethod.GET)
	public String userform(Model model) {
		model.addAttribute("user", new User());
		return "userform";
	}
	@RequestMapping(value = "/showdata",method = RequestMethod.POST)
	public String showdata(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("user", user);
			return "userdata";
		}
}
