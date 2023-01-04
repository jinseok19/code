package edu.kmit.abstractclass.game;


/*
 * 3,6,9가 나오는 갯수만큼 *을 출력하는 프로그램을 구현해 보자.
 * 3,6,9가 들어가는지를 판단.
 * 3,6,9가 들어간 개수 판단.
 * 
 * */
public class Play369CharAt extends AbstractPlay369{
	// 3,6,9 판단하는 메서드 구현
	public int count369(int n) {
		// 3,6,9를 판단해서 개수를 리턴하는 변수
		int result = 0;
		String strNum = n+"";
		for (int i = 0; i < strNum.length(); i++) {
			if (strNum.charAt(i)=='3') {
				result++;
			} else if(strNum.charAt(i)=='6') {
				result++;
			} else if(strNum.charAt(i)=='9') {
				result++;
			}
		}
		
		return result;
	}
	
}
