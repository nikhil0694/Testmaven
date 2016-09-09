package com.psl.aop;

public class Performer {

	public void getUp(){
		System.out.println("Performer gets up");
	}
	public void eatsBreakfast(){
		System.out.println("Performer eats breakfast");
	}
	public void addressAudience(){
		System.out.println("Performer addresses Audience");
	}
	
	public void perform() throws Exception{
		System.out.println("Performer performs a song");
	//	throw new Exception("Its raining");
	}
	public void givesThanks(){
		System.out.println("Performer gives thanks");
	}
	public void goesHome(){
		System.out.println("Performer goes home");
	}
}
