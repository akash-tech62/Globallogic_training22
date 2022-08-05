package com.globallogic.day1;

//write a program to give the color code and print the color name 
//switch and if else ladders

public class ColorCode {
	public static void main(String[] args) {
		System.out.println("1:Red\n2:Green\n3:Blue\n4:Black\n5:Orange\n6:Yellow\n");
		
		int choice= 3;
		switch(choice) {
		case 1:System.out.println("Red");break;
		case 2:System.out.println("Green");break;
		case 3:System.out.println("Blue");break;
		case 4:System.out.println("Black");break;
		case 5:System.out.println("Orange");break;
		case 6:System.out.println("Yellow");break;
		default:
			System.out.println("Wrong color code!!");
		}
	}
}
