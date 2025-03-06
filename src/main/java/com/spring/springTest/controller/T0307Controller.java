package com.spring.springTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/0307")
public class T0307Controller {

	@RequestMapping("/test01")
	public String test01Get() {
		return "0307/test01";
	}
	
	
}
