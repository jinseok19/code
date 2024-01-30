package edu.kmit.game;
	

/*
 * 3,6,9가 나오는 갯수만큼 *을 출력하는 프로그램을 구현해 보자.
 * 3,6,9가 들어가는지를 판단.
 * 3,6,9가 들어간 개수 판단.
 * 
 * */
public class Play369 {
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
		Play369 play369 = new Play369();
		play369.play(100);
//		System.out.println(play369.count369(96));
	}
}
