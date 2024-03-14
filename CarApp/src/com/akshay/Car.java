package com.akshay;

public class Car {
	
	private Engine eng;
	
	public Car() {
		
	}
	
	public Car(Engine eng) {
		this.eng=eng;
	}
	
	public void setEng(Engine eng) {
		this.eng=eng;
	}
	
	public void drive() {
		
		int status = eng.start();
		if(status>=1) {
			System.out.println("Car started..");
		}
		
	}

}
