package com.shrey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value={"/index","/"})
	public ModelAndView index() {
		
		ModelAndView modelAndView =new ModelAndView("index");
		
		return modelAndView;
	}
	
	@RequestMapping(value={"/products"})
	public ModelAndView allProducts() {
		
		ModelAndView modelAndView =new ModelAndView("productsList");
		
		return modelAndView;
	}
	
	@RequestMapping(value={"/productdetails"})
	public ModelAndView productdetails() {
		
		ModelAndView modelAndView =new ModelAndView("productdetails");
		
		return modelAndView;
	}

}
