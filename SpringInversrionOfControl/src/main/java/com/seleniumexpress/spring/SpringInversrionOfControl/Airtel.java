package com.seleniumexpress.spring.SpringInversrionOfControl;

public class Airtel implements Sim {

	
	public Airtel() {
		System.out.println("Airtel constructor");
	}
	
	@Override
	public void data() {
		System.out.println("data using airtel");
		
	}

	@Override
	public void calling() {
		System.out.println("calling using airtel");
		
	}

}
