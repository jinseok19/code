package edu.kmit.magicsquare;

public class Main {

	public static void main(String[] args) {
//		OddMagicSquare odd = new OddMagicSquare();
//		odd.make();
//		odd.print();
//		System.out.println(odd.isCheck());
		
		FourMagicSquare fm = new FourMagicSquare(12);
		fm.make();
		fm.print();
		System.out.println(fm.isCheck());
	}

}
