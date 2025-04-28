package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] wonArr = new int[10];
		wonArr[0] = 50000;
		wonArr[1] = 10000;
		wonArr[2] = 5000;
		wonArr[3] = 1000;
		wonArr[4] = 500;
		wonArr[5] = 100;
		wonArr[6] = 50;
		wonArr[7] = 10;
		wonArr[8] = 5;
		wonArr[9] = 1;

		System.out.print("금액: ");
		int money = sc.nextInt();
		int count = 0;
		
		int i;
		for(i=0; i<wonArr.length; i++) {
			count = money / wonArr[i];
			System.out.println(count);
		}
		
		
		
		sc.close();
	}
}
