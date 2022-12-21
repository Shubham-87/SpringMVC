package com.example.controller;

import java.net.http.HttpResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value = "/userform",method = RequestMethod.GET)
	public String userform() {
		
		return "userform";
	}
	@RequestMapping(value = "/showdata",method = RequestMethod.POST)
	public String showdata(@RequestParam(name = "name") String name, Model model) {
		model.addAttribute("name", name);
			return "userdata";
		}
}
