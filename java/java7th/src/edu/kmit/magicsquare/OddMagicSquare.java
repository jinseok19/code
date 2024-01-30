package edu.kmit.magicsquare;

/*
 * 마방진: 가로, 세로, 대각선을 각각 더해서 나온 값이 모두 일정한 2차원 행렬이다!!!
 * (3마방진, 4마방진, 6마방진)
 * 
 * 홀수 마방진을 만들어보자!@! (3, 5, 7, 9, 11 ...)
 * */
public class OddMagicSquare {
	private int[][] magic; // 마방진을 저장할 변수      
	private int maxNum;
	
	public OddMagicSquare() { //생성자
		this(3);
	}

	public OddMagicSquare(int num) {
		this.init(num);
	}
	
	// 초기화 하는 메서드!
	private void init(int num) {
		magic = new int[num][num]; //배열 초기화: 0으로 초기화한다!
		maxNum = num - 1; // 최대 위치는 num보다 1작다!
	}
	
	// 마방진을 만들 메서드!
	public void make() {
		// 위치값!
		int x = 0;
		int y = maxNum / 2;
		magic[x][y] = 1;
		
		// 값세팅!
		for (int i = 2; i <= (maxNum+1)*(maxNum+1); i++) {
			// temp에 원래 위치 기억!
			int tempX = x;
			int tempY = y;
			
			// x의 위치
			if (x-1 < 0) {
				x = maxNum;
			} else {
				x--;
			}
			
			// y의 위치
			if (y-1 < 0) {
				y = maxNum;
			} else {
				y--;
			}
			
			// 값이 들어있을 경우!!
			if (magic[x][y] != 0) {
				x = tempX+1;
				y = tempY;
			}
			
			// 마방진 배열에 값 세팅하기!
			magic[x][y] = i;
		}
	}
	
	// 만들어진 마방진을 출력하는 메서드!!
	public void print() {
		int count = maxNum + 1;
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
		int count = maxNum+1;
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
				if (i+j == maxNum) {
					mCheck[2*count+1] += magic[i][j];
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















