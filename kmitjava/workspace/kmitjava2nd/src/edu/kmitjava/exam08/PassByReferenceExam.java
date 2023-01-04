package edu.kmitjava.exam08;

public class PassByReferenceExam {
	public static void main(String[] args) {
		// pass by reference
		int[] a = {1, 2, 3, 4, 5};
		int[] c = a;	
		
		c[0] = 100;
		
		System.out.println(a[0]);
	}
}
