package edu.kmit.loop;

/*
 * 반복문 for
 * 	for(int i=0; i<10; i++) {
 *		타입 변수 초기값, 조건, 증감
 *		i++ -> i = i + 1
 *	}
 * 기준값이 이쏙, 일정한 규칙으로 값이 감소나 증가할때 사용
 * 
 * 지역변수(local variable)는 값을 초기화 해주지 않으면 오류가 발생한다.
 * */
public class ForExample {
	// 홀수 짝수 합 구하기
	public void sum1(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i; // 1 ~ n 까지의 합
		}
		System.out.println("1~"+n+"까지의 합: "+sum);
	}
	
	// 홀수의 합
	// continue는 어떤 조건일 경우에는 아래로 진행하지 않고 
	// 다시 위로 이동한다. 한 스텝을 건너뛴다. 
	public void sum2(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i%2 == 1) {
				continue;
			}
			sum = sum + i; // 1 ~ n 까지의 합				
		}
		System.out.println("1~"+n+"까지의 합: "+sum);
	}
	
	public static void main(String[] args) {
		ForExample fe = new ForExample();
		fe.sum1(10);
	}
}
