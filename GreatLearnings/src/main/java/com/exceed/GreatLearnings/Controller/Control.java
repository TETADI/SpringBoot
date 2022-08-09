package com.exceed.GreatLearnings.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.RestController;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class Control {
	
	@GetMapping("/home")
	//@RequestMapping("/")
	public String gethome()
	{
		return "hom.jsp";
	}

}
 