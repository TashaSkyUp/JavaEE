package com.tsu.ioc;

public class Mobile {

	public static void main(String[] args) {
	Sim sim = new Airtel();
	sim.calling();
	sim.data();

	}

}