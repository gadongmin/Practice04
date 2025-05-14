package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };
		char c1[] = c;
		c1[4] = ',';
		c1[7] = ',';
		c1[9] = ',';

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		System.out.println("");

		for (int i = 0; i < c.length; i++) {
			System.out.print(c1[i]);
		}

	}

}
