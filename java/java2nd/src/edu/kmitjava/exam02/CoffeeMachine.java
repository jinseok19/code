package edu.kmitjava.exam02;

/*
 * ?��?��?��, 멤버?��?��, 멤버메소?��
 * */
public class CoffeeMachine {
	private int money;
	private int cup;
	
	public void makeCoffee() {
		if(money<=0) {
			System.out.println("?��?�� ?��?��?�� ?��?��");
		}else {
			cup = money/100;
			System.out.println("커피�? "+cup+"?�� ?��?��?��?��?��.");
		}
	}
}