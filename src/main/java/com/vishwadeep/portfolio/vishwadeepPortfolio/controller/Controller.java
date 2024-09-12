package com.vishwadeep.portfolio.vishwadeepPortfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vishwadeep.portfolio.vishwadeepPortfolio.Entity.Friends;
import com.vishwadeep.portfolio.vishwadeepPortfolio.Service.friendService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private friendService service;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("Friends", new Friends());

		return "index";
	}

	@PostMapping("/")
	public String saveContact(@ModelAttribute("Friends")Friends friend) {
		
		service.saveContact(friend);
		System.err.println(friend);
		
		
		return "redirect:/";
	}

}
