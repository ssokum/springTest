package com.spring.springTest.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LogTestService {

	public void getLogTest1() {
		System.out.println();
		log.info("이곳은 LogTestService객체의 getLogTest1()메소드 입니다.");
		System.out.println();
	}
	
	public int getCalculator(int su) {
		int tot = 0;
		for(int i = 1; i <= su; i++) {
			tot += i;
		}
		System.out.println();
		log.info("1에서 "+su+"까지의 합은 "+tot+"입니다.");
		System.out.println();
		
		return tot;
	}
	
	public void getEvenCalculator11() {
		int tot = 0;
		for(int i = 0; i <= 1000000; i+=2) {
			tot+=i;
		}
		System.out.println();
		log.info("1에서 "+100+"까지의 짝수합은 "+tot+"입니다.");
		System.out.println();
	}
	
	public void getEvenCalculator12() {
		int tot = 0;
		int i = 0;
		while(i < 1000000) {
			tot += (i+=2);
		}
		System.out.println();
		log.info("1에서 "+100+"까지의 짝수합은 "+tot+"입니다.(while)");
		System.out.println();
	}
}
