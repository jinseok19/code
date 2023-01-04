package edu.kmit.game;
	

/*
 * 3,6,9가 나오는 갯수만큼 *을 출력하는 프로그램을 구현해 보자.
 * 3,6,9가 들어가는지를 판단.
 * 3,6,9가 들어간 개수 판단.
 * 
 * */
public class Play369Divide {
	// 3,6,9 판단하는 메서드 구현
	public int count369(int n) {
		// 3,6,9를 판단해서 개수를 리턴하는 변수
		int result = 0;
		// 들어온 숫자를 받는 변수
		int a = 0;
		a = n;
		for (int i = 0; i < (n+"").length(); i++) {
			if ((a%10) != 0 && (a%10)%3 == 0) {
				result++;
			}
			a = a / 10;
		}
		
		return result;
	}
	
	// 값이 잘 나오는지 실행
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
	
	public static void main(String[] args) {
		Play369Divide play369 = new Play369Divide();
		play369.play(100);
//		System.out.println(play369.count369(96));
	}
}
