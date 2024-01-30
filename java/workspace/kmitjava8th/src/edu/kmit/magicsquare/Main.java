package edu.kmit.magicsquare;

public class Main {

	public static void main(String[] args) {
		SixMagicSquare sm = new SixMagicSquare(4002);
		sm.make();
		sm.print();
		System.out.println(sm.isCheck());
	}

}
