package edu.kmit.magicsquare;

/*
 * 짝수 마방진 중에 4마방진 만들기
 * - 기본흐름
 * - 역흐름
 * */

public class FourMagicSquare {
	private int[][] magic;
	
	public FourMagicSquare() {
		this(4);
	}

	public FourMagicSquare(int num) {
		init(num);
	}

	private void init(int num) {
		magic = new int[num][num];
	}
	
	// 4마방진을 구현하는 로직!!
	public void make() {
		makeRight(); //기본흐름
		makeLeft(); //역흐름
	}
	
	// 역방향 흐름을 구현하는 메소드!!
	private void makeLeft() {
		int count = magic.length;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (i >= count/4 && i < count/4*3) {
					if (j >= 0 && j < count/4 || j >= count/4*3 && j < count) {
						magic[i][j] = (count*count) - (i * count + j);
					}
				} else {
					if (j >= count/4 && j < count/4*3) {
						magic[i][j] = (count*count) - (i * count + j);
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

	// 만들어진 마방진을 출력하는 메서드!!
	public void print() {
		int count = magic.length;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();
		}
	} //출력하기
	
	// 마방진 로직 검증 메서드!
	public boolean isCheck() {
		boolean isT = true;
		int count = magic.length;
		// 같은 타입이 여러개 저장될 방을 만든다!!
		// 2*n+2개의 방을 만든다!
		int[] mCheck = new int[2*count+2];
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				// 가로 n줄!
				mCheck[i] += magic[i][j];
				// 세로 n줄!
				mCheck[i+count] += magic[j][i];
				// \대각선(i == j)!
				if (i == j) {
					mCheck[2*count] += magic[i][j];
				}
				// /대각선(i+j = maxNum)!
				if (i+j == count-1) {
					mCheck[2*count+1] += magic[i][j];
				}
			}
		}
		
		// mCheck방에 들어간 값들이 모두 같은지 체크
		for (int i = 1; i < mCheck.length; i++) {
			if (mCheck[0] != mCheck[i]) {
				isT = false;
				break;
			}
		}
		return isT;
	}
}







































