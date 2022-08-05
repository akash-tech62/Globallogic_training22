package com.globallogic.day1;

//Write a program to vote system if age is > 18 allow to cast a vote

public class VoteSystem {
	public static void main(String[] args) {
		
		int age=17;
		
		if(age>18) {
			System.out.println("You can cast a Vote!!");
		}
		else {
			System.out.println("You cannot cast a vote!!");
		}
	}

}
