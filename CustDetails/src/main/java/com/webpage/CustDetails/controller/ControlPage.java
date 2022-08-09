package com.webpage.CustDetails.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class ControlPage
{
	@Controller
	public class ControllerMVC
	{
		@GetMapping(value="/homes")
	public String gethome()
	{
		return "home.jsp";
	}
	}
}

