package com.java.designpatterns.state;

public class FirstYearKid implements KidState {

	@Override
	public void play() {
		System.out.println("Play in cradle");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Drink Milk");
	}

}
