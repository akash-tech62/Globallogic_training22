package com.globallofic.day10;

import java.util.*;

//Create a lambda to find the even and odd value
//create a lambda to find the largest number
//create a lambda to find the minimum  number
//create a lambda to print the hello world
//create a lambda to print the sum of 1 to 100 number

interface find 
{
	public void even_odd();
}

interface larg{
	public void large();
}

interface minm{
	public void min();
}

interface print{
	public void show();
}

interface Sum{
	public void sum();
}

public class LamdaDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//1
		find obj1 = ()->{
						System.out.println("Enter a  number : ");
						int a = sc.nextInt();
						if(a%2==0) {
						System.out.println("Even Number");
						}
						else	
						System.out.println("Odd Number");
						};
						obj1.even_odd();
		
//2
				larg obj2 = ()->{
								System.out.println("Enter a 1 number : ");
								int a = sc.nextInt();
								System.out.println("Enter a 2 number : ");
								int b = sc.nextInt();
								if(a>b) {
								System.out.println("A is largest");
								}
								else	
									System.out.println("B is largest");
								};
								obj2.large();

		//3
				minm obj3 = ()->{
								System.out.println("Enter a 1 number : ");
							int a = sc.nextInt();
							System.out.println("Enter a 2 number : ");
							int b = sc.nextInt();
								if(a<b) {
								System.out.println("A is minimum");
								}
								else	
								System.out.println("B is minimum");
				};
								obj3.min();
	

		//4
					print obj4 = ()-> System.out.println("Hello World!!");
					obj4.show();
					
		//5
					
					Sum obj5 = ()->{
						int i=0;
						for(int j=0;j<=100;j++)
						{
							i=i+j;
						}
						System.out.println("Sum of 1 to 100 is " +i);
					};
					obj5.sum();
}

}
