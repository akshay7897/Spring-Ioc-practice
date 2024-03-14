package com.ap;

public class Car {
	
	
	public void drive() {
		Engine eng=new Engine();
		int status = eng.start();
		if(status>=1) {
			System.out.println("car started ..");
		}else {
			System.out.println("Car not starting...");
		}
		
	}
	
	
	public static void main(String[] args) {
		var a=10.9;
		var b="akshay";
		
		
		System.out.println(a);
		System.out.println(b+" patil");
		
		
//		new Car().drive();
	}

}
