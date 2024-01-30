package edu.kmit.abstractclass.game;

public abstract class AbstractPlay369 {
	// overriding 할 메소드를 선언한다.!
	public abstract int count369(int n);
	
	// 공통되는 메소드인 play메소드를 추상 클래스에 놓는다.
	public void play(int max) {
		for (int i = 1; i <= max; i++) {
			if (count369(i)>0) {
				for (int j = 0; j < count369(i); j++) {
					System.out.print("*");
				}
				System.out.print("\t");
			} else {
				System.out.print(i+"\t");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
	
	
}
