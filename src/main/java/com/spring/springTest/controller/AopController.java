package com.spring.springTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springTest.service.LogTestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/aop")
public class AopController {
	
	@Autowired
	LogTestService logTestService;
	
	@RequestMapping(value = "/aopMenu", method = RequestMethod.GET)
	public String aopMenuGet() {
		log.info("\n이곳은 AopController 객체의 aopMenuGet()입니다.\n");
		return "aop/aopMenu";
	}
	@RequestMapping(value = "/aopTest1", method = RequestMethod.GET)
	public String aopTest1Get() {
		logTestService.getLogTest1();
		return "aop/aopMenu";
	}
	@RequestMapping(value = "/aopTest2", method = RequestMethod.GET)
	public String aopTest2Get(int su) {
		logTestService.getCalculator(su);
		return "aop/aopMenu";
	}
	@RequestMapping(value = "/aopTest3", method = RequestMethod.GET)
	public String aopTest3Get() {
		logTestService.getEvenCalculator11();
		return "aop/aopMenu";
	}
	@RequestMapping(value = "/aopTest4", method = RequestMethod.GET)
	public String aopTest4Get() {
		logTestService.getEvenCalculator12();
		return "aop/aopMenu";
	}
}
