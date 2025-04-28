package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		int[] intA = {10, 20, 30, 40, 50};
		int result = 0;
		int i;
		
		for(i=0; i<intA.length; i++) {
			result = result + intA[i];
		}
		System.out.println("평균은 " + (double)result / 5 + " 입니다.");
	}

}
