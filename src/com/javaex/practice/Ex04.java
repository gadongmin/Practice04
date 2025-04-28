package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		int[] date = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int count = 0; // 갯수를 위한 초기화값
		int result = 0; // 합을 위한 초기화값
		int i;
		
		for(i=0; i<date.length; i++) {
			if(date[i] % 3 == 0) {
				result = result + date[i];
				count++;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=> " + count);
		System.out.println("주어진 배열에서 3의 배수의 합=> " + result);

	}

}
