package com.java.designpatterns.state;
public class Kid {
	private int age;
	private KidState kidStateObj;
	public Kid(int age) {
		this.setAge(age);
	}
	public void play() {
		kidStateObj.play();
	}
	public void eat() {
		kidStateObj.eat();
	}
	public void setAge(int age) {
		this.age = age;
		if(age == 1) {
			System.out.println("Age of kid is : 1");
			kidStateObj = new FirstYearKid();
		}else if(age == 2) {
			System.out.println("Age of kid is : 2");
			kidStateObj = new SecondYearKid();
		}else if(age == 3) {
			System.out.println("Age of kid is : 3");
			kidStateObj = new ThirdYearKid();
		}else if(age == 4) {
			System.out.println("Age of kid is : 4");
			kidStateObj = new FourthYearKid();
		}else {
			System.out.println("There is age more than 4 so we take age is 1");
			kidStateObj = new FirstYearKid();
		}
	}
}
