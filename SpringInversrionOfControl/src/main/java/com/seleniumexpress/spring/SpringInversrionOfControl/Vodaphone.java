package com.seleniumexpress.spring.SpringInversrionOfControl;

public class Vodaphone implements Sim {

	@Override
	public void data() {
		System.out.println("data using vodaphone");
		
	}

	@Override
	public void calling() {
		System.out.println("calling using vodaphone");
		
	}

}
