package edu.kmit.abstractmagicsquare;

public abstract class AbstractMagicSquare {
	public int[][] magic;
	public int maxIdx;

	public abstract void make();

	public void init(int num) {
		magic = new int[num][num]; // 배열 초기화: 0으로 초기화한다!
		maxIdx = num - 1; // 최대 인덱스는 num보다 1작다!
	}

	public void print() {
		int count = maxIdx + 1;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(magic[i][j] + "\t");
			}
			System.out.println();
		}
	} // 출력하기

	public boolean isCheck() {
		boolean isT = true;
		int count = maxIdx + 1;
		// 같은 타입이 여러개 저장될 방을 만든다!!
		// 2*n+2개의 방을 만든다!
		int[] mCheck = new int[2 * count + 2];
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				// 가로 n줄!
				mCheck[i] += magic[i][j];
				// 세로 n줄!
				mCheck[i + count] += magic[j][i];
				// \대각선(i == j)!
				if (i == j) {
					mCheck[2 * count] += magic[i][j];
				}
				// /대각선(i+j = maxIdx)!
				if (i + j == maxIdx) {
					mCheck[2 * count + 1] += magic[i][j];
				}
			}
		}

		// mCheck방에 들어간 값들이 모두 같은지 체크!!
		for (int i = 1; i < mCheck.length; i++) {
			if (mCheck[0] != mCheck[i]) {
				isT = false;
				break;
			}
		}
		return isT;
	}
}
