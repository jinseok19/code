package edu.kmitjava.exam03;

public class CoffeeMachine2 {
	private static int money=1000;
	private static int cup;
	
	public static void makeCoffee() {
		cup = money/10;
		System.out.println("커피�? "+cup+"?�� ?��?��?��?��?��.");
	}
	
	public static void main(String[] args) {
		makeCoffee();
	}
}
