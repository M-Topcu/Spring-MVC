package com.tpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@GetMapping("/hi")
	public ModelAndView sayHi() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message","Hi");
		mav.setViewName("hi");
		return mav;
	}

}
