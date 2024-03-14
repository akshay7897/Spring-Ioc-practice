package com.akshay;

public class Test {
	
	public static void main(String[] args) {
		
		Car c=new Car(new PetrolEngine()); // constructer injection
		
		Car car=new Car();
		car.setEng(new DeselEngine()); // setter injection
		
		car.drive();
		c.drive();
		
	}

}
