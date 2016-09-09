package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut(value="execution(* com.psl.aop.Performer.perform(..))")
	public void dummy(){
		
	}
	
	//@Before(value = "dummy()")
	public void takeSeats(){
		System.out.println("Audience take seats");
	}
	
	public void switchOffMobiles(){
		System.out.println("Audience switch off mobiles");
	}
	
	@After(value="dummy()")
	public void applaud(){
		System.out.println("Audience applaud performance");
	}
	
	public void demandRefund(){
		System.out.println("Audience demand refund");
	}
	
	@Around(value = "dummy()")
	public void watchPerformance(ProceedingJoinPoint jp){
		
		takeSeats();
		switchOffMobiles();
		
		try {
			jp.proceed();
			System.out.println("Audience watching performance");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			demandRefund();
			e.printStackTrace();
		}
		
		applaud();
		goHome();
		
	}

	@After(value="dummy()")
	public void goHome(){
		System.out.println("Audience goHome");
	}
}
