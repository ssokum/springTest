package com.spring.springTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/0307")
public class T0307Controller {

	@RequestMapping("/xmlMenu")
	public String xmlMenuGet() {
		return "0307/xmlMenu";
	}
	
	@RequestMapping("/test1")
	public String test1Get() {
		return "0307/test1";
	}
	
	@RequestMapping("/test2")
	public String test2Get(Model model) {
		return "0307/test2Ok";
	}
	@RequestMapping("/test2Ok")
	public String test2OkGet(Model model) {
		
		return "0307/test2Ok";
	}
}
