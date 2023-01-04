package edu.kmitjava.exam02;

/*
 * ?´?˜?Š¤, ë©¤ë²„?•„?“œ, ë©¤ë²„ë©”ì†Œ?“œ
 * */
public class CoffeeMachine {
	private int money;
	private int cup;
	
	public void makeCoffee() {
		if(money<=0) {
			System.out.println("?ˆ?´ ?—†?–´?š” ?…œ?…œ");
		}else {
			cup = money/100;
			System.out.println("ì»¤í”¼ê°? "+cup+"?” ?‚˜?™”?Šµ?‹ˆ?‹¤.");
		}
	}
}