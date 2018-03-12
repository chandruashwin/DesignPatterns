package com.java.designpatterns.state;

public class StatePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid kidObj = new Kid(2);
		kidObj.play();
		kidObj.eat();
		kidObj.setAge(4);
		kidObj.play();
		kidObj.eat();
		kidObj.setAge(1);
		kidObj.play();
		kidObj.eat();
	}

}
