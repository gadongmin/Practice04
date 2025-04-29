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
		
		for(int i=0; i<wonArr.length; i++) {
			int won = wonArr[i]; // 돈 현황 표시
			int count = money / won; // 돈 수량 표시
			money = money % won; // 잔액 누적적용 표시
			
			System.out.println(won + "원: " + count + "개");
		}
		
		sc.close();
		}
		
	}
