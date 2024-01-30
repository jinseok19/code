package edu.kmit.abstractmagicsquare;

/*
 * 짝수 마방진 중에 4의 배수로 만들어지는 마방진 구현하기
 * A: y n/4마큼 3으로 채우고, x n/4 위치를 오른쪽으로 한칸 민다!!
 * 		나머지를 0으로 채운다.
 * B: 뒷쪽에서 n/4 - 1의 두께를 1로 채우고 나머지를 2로 채운다!
 * 		1을 먼저 그냥 채운다!
 *		n/2-(n/4-1)을 뺀만큼을 2로 채운다.
 * C: A에 있는 3->0으로 변환한다. 0->3으로 변환한다!
 * D: B에 있는 2->1로 변환하고, 1->2로 변환한다!!
 * */

public class SixMagicSquare extends AbstractMagicSquare{
	
	public SixMagicSquare() {
		this(6);
	}

	public SixMagicSquare(int num) {
		init(num);
	}
	// 6마방진 구현하기
	public void make() {
		makeA();
		makeB();
		makeCD();
		multiples();
		addABCD();
	}
	
	// A영역 구현!
	private void makeA() {
		int count = magic.length;
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/4; j++) {
				if (count/4 == i) {
					magic[i][j+1] = 3;
				}else {
					magic[i][j] = 3;
				}
			}
		}
	}

	// B영역 구현!
	private void makeB() {
		int count = magic.length;
		// 우선 B영역 모두에 1값을 할당
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2; j++) {
				magic[i][j+count/2] = 1;
			}
		}
		// 오른쪽기준 count/4-1만큼의 두께를 빼고모두 2로 바꿔준다!!
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2-(count/4-1); j++) {
				magic[i][j+count/2] = 2;
			}
		}
	}
	
	// CD영역 구현!
	private void makeCD() {
		int count = magic.length;
		// C영역
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2; j++) {
				if (magic[i][j] == 0) {
					magic[i+count/2][j] = 3;
				}else {
					magic[i+count/2][j] = 0;
				}
			}
		}
		// D영역
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2; j++) {
				if (magic[i][j+count/2] == 1) {
					magic[i+count/2][j+count/2] = 2;
				}else {
					magic[i+count/2][j+count/2] = 1;
				}
			}
		}
	}
	
	// (n/2)*(n/2)를 ABCD 모든 영역에 곱한다!!
	private void multiples() {
		int count = magic.length;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				magic[i][j] *= (count/2)*(count/2);
			}
		}
	}
	
	// n/2의 홀수 마방진 값을 모든 영역에 더하기
	private void addABCD() {
		int count = magic.length;
		// count/2의 값으로 홀수 마방진을 만들어서 가져요기!
		OddMagicSquare odd = new OddMagicSquare(count/2);
		odd.make();
		int oddM[][] = odd.getMagic();
		
		// 구해온 홀수 마방진의 값들을 각 영역에 모두 더해준다.
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2; j++) {
				magic[i][j] += oddM[i][j];
				magic[i][j+count/2] += oddM[i][j];
				magic[i+count/2][j] += oddM[i][j];
				magic[i+count/2][j+count/2] += oddM[i][j];				
			}
		}
	}	
}
