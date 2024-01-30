package edu.kmit.exam10;

// 별모양을 출력하는 메서드 구현하기
public class Star {
	public static void start1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 1,3,5
	public static void start2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void start3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		start3(5);
	}
}
