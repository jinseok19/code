package edu.kmit.lotto;

/*
 * 로또 만들기
 * . 1~45까지 정수중에 서로다른 6개의 숫자를 뽑는다.
 * */

public class Lotto {
	// 같은 타입이 여러개 --> 6개가 들어갈 방을 만든다.
	private int[] ball; //추첨된 로또가 담길 배열
	
	// 외부에서 만들어진 로또 번호를 가져가는 메서드
	public int[] getBall() {
		return ball;
	}
	// 배열 초기화 해주기 (생성자 --> 값을 초기화 할때)
	public Lotto() {
		ball = new int[6];
	}
	
	// 원하는 임의의 수 만들고, 저장하기.
	// 전위 연산자(++i) i = i + 1
	// 후위 연산자(i++) i = i + 1
	public void make() {
		int count = 0;
		while (true) {
			// Math.random()은 0~1 사이의 임의의 난수를 뽑음.
			// 1~45까지의 정수중에서 임의의 수를 하나 뽑음
			int num = (int)(Math.random()*45)+1;
			// 같은게 나오지 않았을 경우에만 count++
			// ball 안에 지금 추첨한 num이 존재하지 않을 경우에만 if문을 처리한다.
			if (!isSame(ball, num)) {
				ball[count++] = num;
			}
			
			if (count == 6) {
				break;
			}	
		}
	}

	// 추첨한 번호를 가져와서 현재 추첨된 번호들과 같은 번호가
	// 있는지를 비교하는 메소드
	private boolean isSame(int[] ball, int num) {
		boolean isT = false;
		for (int i = 0; i < ball.length; i++) {
			if (ball[i] == num) {
				isT = true;
				break;
			}
		}
		return isT;
	}
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.make();
		int[] b = lotto.getBall();
		for (int i : b) {
			System.out.print(i+"/");
		}
	}
}