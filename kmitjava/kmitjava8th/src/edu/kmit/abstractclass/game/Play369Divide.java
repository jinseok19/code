package edu.kmit.abstractclass.game;
	

/*
 * 3,6,9가 나오는 갯수만큼 *을 출력하는 프로그램을 구현해 보자.
 * 3,6,9가 들어가는지를 판단.
 * 3,6,9가 들어간 개수 판단.
 * 
 * */
public class Play369Divide extends AbstractPlay369 {
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
}