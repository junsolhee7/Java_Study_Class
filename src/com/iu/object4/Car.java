package com.iu.object4;

public class Car {

	String company = "쌍용";
	String brand ;
	String color;
	boolean gear;	//true 오토, false 수동
	
	public void info() {
		System.out.println("company : "+ this.company);
		System.out.println("brand : "+ this.brand);
		System.out.println("color : "+ this.color);
		System.out.println("gear : "+ this.gear);
	}
	//instance 초기화 블럭 {} : 활용도 중
//	{
//		this.company = "기아";
//		this.brand = "k5";
//		this.color = "black";
//		this.gear = false;
//	}
	
	public Car(String color) { //: 활용도 중
		this.company = "현대";
		this.brand = "아반떼";
		this.color = "white";
		this.gear = true;
	}
	public Car(String brand, String color) {
		this.company = "현대";
		this.brand = "아반떼";
		this.color = "white";
		this.gear = true;
	}
		
	}
