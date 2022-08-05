package com.globallogic.day1;

public class Factorial {
	public static void main(String[] args) {
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact= fact*i;
		}
		System.out.println("Factorial of a number is= "+fact);
	}
}
