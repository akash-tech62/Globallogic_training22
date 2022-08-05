package com.globallogic.day1;

//Write a program to give the month num and print the month name  
//switch and if else ladders

public class MonthNumber {
public static void main(String[] args) {
	System.out.println("1:January\n2:Febrary\n3:March\n4:April\n5:May\n6:June\n"
			  + "7:July\n8:August\n9:September\n10:October\n11:November\n12:December\n\n");
	
	int choice= 3;
	switch(choice) {
	case 1:System.out.println("Januarr");break;
	case 2:System.out.println("Febrary");break;
	case 3:System.out.println("March");break;
	case 4:System.out.println("April");break;
	case 5:System.out.println("May");break;
	case 6:System.out.println("June");break;
	case 7:System.out.println("July");break;
	case 8:System.out.println("August");break;
	case 9:System.out.println("September");break;
	case 10:System.out.println("October");break;
	case 11:System.out.println("November");break;
	case 12:System.out.println("December");break;

	default:
		System.out.println("Wrong month number!!");
}}
}
