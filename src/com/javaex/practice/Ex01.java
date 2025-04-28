package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArr = new int[5];
		intArr[0] = 3;
		intArr[1] = 7;
		intArr[2] = 12;
		
		int result = 0;
		
		for(int i=0; i<intArr.length; i++) {
			result = result + intArr[i];
		}
		System.out.println(result);
	}

}
