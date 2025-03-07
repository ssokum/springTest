package com.spring.springTest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableAspectJAutoProxy
@Component
@Aspect
public class AspectTest {
	
	// Advice(종류: Around/Before/after/AfterReturning/After-throwing(예외발생))
	
	// 문제1: LogTestService객체의 getLogTest1()메소드 수행 '전/후'에 메세지 출력.
	@Around("execution(* com.spring.springTest.service.LogTestService.getLogTest1(..))")
	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("\n이곳은 aroundAdvice() 메소드 입니다.(전) - 핵심코드 수행 전");
		
		joinPoint.proceed();
		
		System.out.println("\n이곳은 aroundAdvice() 메소드 입니다.(후) - 핵심코드 수행 후");	
	}
	
	// 문제2: getCalculator() 메소드 수행 전/후에 메세지 출력.
	@Before("execution(* com.spring.springTest.service.LogTestService.getCalculator(..))")
	public void beforeAdvice() {
		System.out.println("\n이곳은 getCalculator() 메소드 입니다.(전) - 핵심코드 수행 전");
	}
	@After("execution(* com.spring.springTest.service.LogTestService.getCalculator(..))")
	public void afterAdvice() {
		System.out.println("\n이곳은 getCalculator() 메소드 입니다.(후) - 핵심코드 수행 후");
	}
	
	// 문제3: getCalculator() 메소드 수행후 결과 반환값을 출력.
	@AfterReturning(value="execution(* com.spring.springTest.service.LogTestService.getCalculator(..))", returning="res")
	public void afterReturningAdvice(JoinPoint joinPoint, Object res) {
		System.out.println("\n이곳은 getCalculator() 메소드 입니다.(반환값) - 핵심코드 반환값 : " + res);
	}
	
	// 문제4: getEvenCalculator()메소드 수행 전/후에 Log찍으시오
	/*
	 * @Before("execution(* com.spring.springTest.service.LogTestService.getEvenCalculator(..))"
	 * ) public void beforeAdviceEven() {
	 * System.out.println("\n이곳은 getCalculator() 메소드 입니다.(전) - 핵심코드 수행 전"); }
	 * 
	 * @After("execution(* com.spring.springTest.service.LogTestService.getEvenCalculator(..))"
	 * ) public void afterAdviceEven() {
	 * System.out.println("\n이곳은 getCalculator() 메소드 입니다.(후) - 핵심코드 수행 후"); }
	 */
	
	//문제5: getEvenCalculator() 메소드와 getEvenCalculator2() 메소드의 수행시간을 비교
	long startTime, endTime;
	@Pointcut("execution(* com.spring.springTest.service.LogTestService.getEvenCalculator1*(..))")
	private void cut() { }
	
	@Around("cut()")
	public void aroundAdvice2(ProceedingJoinPoint joinPoint) throws Throwable {
		startTime = System.nanoTime();
		
		System.out.println("\n이곳은 aroundAdvice2() 메소드 입니다.(전) - 핵심코드 수행 전 : ");
		joinPoint.proceed();
		System.out.println("\n이곳은 aroundAdvice2() 메소드 입니다.(후) - 핵심코드 수행 후 : ");	
		
		endTime = System.nanoTime();
		
		// 수행시간
		long res = endTime - startTime;
		log.info("수행시간:  " + res);
	}
	
	// 문제6: service객체 모든 메소드에 대한 수행시간을 출력하시오
	/*
	 * @Around("execution(* com.spring.springTest.service..*.*(..))") public Object
	 * aroundAdvice3(ProceedingJoinPoint joinPoint) throws Throwable { startTime =
	 * System.nanoTime();
	 * 
	 * try { Object result = joinPoint.proceed(); return result; } catch (Exception
	 * e) { e.printStackTrace(); } finally { endTime = System.nanoTime();
	 * 
	 * // 수행시간 long res = endTime - startTime; log.info("수행시간:  " + res);
	 * System.out.println("======================="); }
	 * 
	 * return ""; }
	 */
}
