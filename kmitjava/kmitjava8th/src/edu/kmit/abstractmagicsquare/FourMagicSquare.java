package edu.kmit.abstractmagicsquare;

/*
 * 짝수 마방진 중에 4마방진 만들기
 * - 기본흐름
 * - 역흐름
 * */

public class FourMagicSquare extends AbstractMagicSquare{

	public FourMagicSquare() {
		this(4);
	}

	public FourMagicSquare(int num) {
		init(num);
	}

	// 4마방진을 구현하는 로직!!
	public void make() {
		makeRight(); // 기본흐름
		makeLeft(); // 역흐름
	}

	// 역방향 흐름을 구현하는 메소드!!
	private void makeLeft() {
		int count = magic.length;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (i >= count / 4 && i < count / 4 * 3) {
					if (j >= 0 && j < count / 4 || j >= count / 4 * 3 && j < count) {
						magic[i][j] = (count * count) - (i * count + j);
					}
				} else {
					if (j >= count / 4 && j < count / 4 * 3) {
						magic[i][j] = (count * count) - (i * count + j);
					}
				}
			}
		}
	}

	// 정방향 흐름을 구현하는 메소드!!
	private void makeRight() {
		int count = magic.length;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				// 2차원 --> 1차원으로 바꿔주는 공식
				// 알칼제이 --> 1 * count + j + 1
				magic[i][j] = i * count + j + 1;
			}
		}
	}

}
