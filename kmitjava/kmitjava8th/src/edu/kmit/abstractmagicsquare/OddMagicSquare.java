package edu.kmit.abstractmagicsquare;

/*
 * 마방진: 가로, 세로, 대각선을 각각 더해서 나온 값이 모두 일정한 2차원 행렬이다!!!
 * (3마방진, 4마방진, 6마방진)
 * 
 * 홀수 마방진을 만들어보자!@! (3, 5, 7, 9, 11 ...)
 * */
public class OddMagicSquare extends AbstractMagicSquare {

	// magic의 getter메소드!!
	public int[][] getMagic() {
		return magic;
	}

	public OddMagicSquare() { // 생성자
		this(3);
	}

	public OddMagicSquare(int num) {
		init(num);
	}

	// 마방진을 만들 메서드!
	public void make() {
		// 위치값!
		int x = 0;
		int y = (magic.length-1) / 2;
		magic[x][y] = 1;

		// 값세팅!
		for (int i = 2; i <= (maxIdx + 1) * (maxIdx + 1); i++) {
			// temp에 원래 위치 기억!
			int tempX = x;
			int tempY = y;

			// x의 위치
			if (x - 1 < 0) {
				x = maxIdx;
			} else {
				x--;
			}

			// y의 위치
			if (y - 1 < 0) {
				y = maxIdx;
			} else {
				y--;
			}

			// 값이 들어있을 경우!!
			if (magic[x][y] != 0) {
				x = tempX + 1;
				y = tempY;
			}

			// 마방진 배열에 값 세팅하기!
			magic[x][y] = i;
		}
	}
}
