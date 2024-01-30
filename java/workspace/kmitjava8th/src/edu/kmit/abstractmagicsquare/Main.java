package edu.kmit.abstractmagicsquare;

public class Main {

	public static void main(String[] args) {
//		AbstractMagicSquare ame = new OddMagicSquare(9);
//		AbstractMagicSquare ame = new FourMagicSquare(8);
		AbstractMagicSquare ame = new SixMagicSquare(6);
		ame.make();
		ame.print();
		System.out.println(ame.isCheck());
	}
}