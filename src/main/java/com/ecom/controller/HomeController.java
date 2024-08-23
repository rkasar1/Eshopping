package com.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}

	@GetMapping("/register")
	public String register()
	{
		return "signup";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	
	@GetMapping("/product")
	public String products()
	{
		return "product";
	}
	
	@GetMapping("/products")
	public String product()
	{
		return "view_product";
	}
}
