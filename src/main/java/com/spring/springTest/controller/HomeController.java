package com.spring.springTest.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/logTest", method = RequestMethod.GET)
	public String logTestGet() {
		/*
		 * 로깅레벨(Logging Level) : trace/debug / info/warning/error / fatal 
		 * 디버깅 목적으로 사용하는것 : trace/debug
		*/
		
		Date today = new Date();
		
		System.out.println();
		
		logger.info("Logger 객체를 이용한 로그 출력");
		logger.trace("2.현재 날짜 시간은(trace)? {}", today);
		logger.debug("3.현재 날짜 시간은(debug)? {}", today);
		logger.info("1.현재 날짜 시간은(info)? {}", today);
		logger.warn("1.현재 날짜 시간은(warn)? {}", today);
		logger.error("1.현재 날짜 시간은(error)? {}", today);
		//logger.fatal("1.현재 날짜 시간은(fatal)? {}", today);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		log.info("Lombok 라이브러리를 이용한 출력(@Slf4j)");
		log.trace("2.현재 날짜 시간은(trace)? {}", today);
		log.debug("3.현재 날짜 시간은(debug)? {}", today);
		log.info("1.현재 날짜 시간은(info)? {}", today);
		log.warn("1.현재 날짜 시간은(warn)? {}", today);
		log.error("1.현재 날짜 시간은(error)? {}", today);
		
		System.out.println();
		
		
		return "redirect:/message/homeOk";
	}
	
}
