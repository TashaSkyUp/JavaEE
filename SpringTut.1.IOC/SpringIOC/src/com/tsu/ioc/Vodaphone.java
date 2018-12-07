package com.tsu.ioc;

public class Vodaphone implements Sim{
	@Override
	public void calling() {
		System.out.println("calling using "+this.getClass().getName());
		
	}

	@Override
	public void data() {
		System.out.println("Data from "+this.getClass().getName());
		
	}



}
