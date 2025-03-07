package com.spring.springTest.s0307;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springTest.service.SungjuckService;
import com.spring.springTest.vo.SungjukVo;

public class T03_SungjukCalcRun {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml");
		
		/*
		SungjukVo vo1 = null;
		SungjukVo vo2 = null;
		SungjukVo vo3 = null;
		vo1 = (SungjukVo) ctx.getBean("vo1");
		vo2 = (SungjukVo) ctx.getBean("vo2");
		vo3 = (SungjukVo) ctx.getBean("vo3");
		
		int tot = vo1.getKor() + vo1.getEng() + vo1.getMath();
		double avg = tot/3.0;
		String grade = "";
		if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else grade = "F";
		
		System.out.println("성명 : " + vo1.getName());
		System.out.println("국어 : " + vo1.getKor());
		System.out.println("영어 : " + vo1.getEng());
		System.out.println("수학 : " + vo1.getMath());
		System.out.println("평점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
		*/
		
		List<SungjukVo> vos = new ArrayList<SungjukVo>();
		SungjukVo vo = null;
		
		vo = (SungjukVo) ctx.getBean("vo1");
		vos.add(vo);
		vo = (SungjukVo) ctx.getBean("vo2");
		vos.add(vo);
		vo = (SungjukVo) ctx.getBean("vo3");
		vos.add(vo);
		
		SungjuckService service = new SungjuckService();
		
		service.getLine();
		for(SungjukVo v : vos) {
			service.calc(v);
		}
		service.getLine();
	}
}
