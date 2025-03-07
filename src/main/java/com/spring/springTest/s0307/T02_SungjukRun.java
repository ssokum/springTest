package com.spring.springTest.s0307;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springTest.vo.SungjukVo;

public class T02_SungjukRun {
	
	public static void main(String[] args) {
		
		// xml 파일을 읽어오는 위치와 시점에 따른 4가지 Class
		// 	ClassPathXmlApplicationContext : ClassPath에 위치한 xml파일을 읽어 설정 정보를 로딩
		// 	FileSystemXmlApplicationContext : 파일 경로로 지정된 곳의 xml파일을 읽어 설정 정보를 로딩
		// 	XmlWebApplicationContext : 웹 어플리케이션에 위치한 곳의 xml파일을 읽어 설정 정보를 로딩
		// 	AnnotationConfigApplicationContext : @Configuration 어노테이션이 붙은 클래스에서의 xml 파일을 읽어 설정 정보를 로딩
		
		//앞에 정의된 것들에 보편화된 클래스 : GenericXmlWebApplicationContext()
		
		//xml로 만든 파일을 스프링 컨테이너에 bean으로 등록시켰다면, 호출시는 'getBean("id")',   'getBean("id", 클래스)'로 불러서 사용 
		
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml");
		
		//SungjukVo vo = ctx.getBean("vo1", SungjukVo.class);
		SungjukVo vo = (SungjukVo) ctx.getBean("vo1");
		System.out.println("name : " + vo.getName());
		System.out.println("kor : " + vo.getKor());
		System.out.println("eng : " + vo.getEng());
		System.out.println("math : " + vo.getMath());
		
		vo = ctx.getBean("vo2", SungjukVo.class);
		System.out.println("name : " + vo.getName());
		System.out.println("kor : " + vo.getKor());
		System.out.println("eng : " + vo.getEng());
		System.out.println("math : " + vo.getMath());
		
		vo = ctx.getBean("vo3", SungjukVo.class);
		System.out.println("name : " + vo.getName());
		System.out.println("kor : " + vo.getKor());
		System.out.println("eng : " + vo.getEng());
		System.out.println("math : " + vo.getMath());
	}
}
