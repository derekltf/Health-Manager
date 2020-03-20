package com.dlcreation.hm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getPage(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("hello");
		System.out.println("[TOTOTOTO]");
		model.addObject("message", "Derek is the creator");
		return model;
	}
}
