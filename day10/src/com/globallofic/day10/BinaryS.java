package com.globallofic.day10;

import java.util.Scanner;

public class BinaryS {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int size=10, i, search, first, last, middle;
	     
		int[] arr = new int[size];
	      
	      System.out.print("Enter 10 Elements (in Ascending): ");
	      for(i=0; i<size; i++)
	      {
	         arr[i] = sc.nextInt();
	      }
	      
	      System.out.print("Enter an Element to Search: ");
	      search = sc.nextInt();
	      
	      first = 0;
	      last = size;
	      middle = (first+last)/2;
	     
	      while(first<=last)
	      {
	         if(arr[middle]<search)
	         {
	            first = middle+1;
	         }
	         else if(arr[middle]==search)
	         {
	            System.out.println("\nThe element is available at Index No." +middle);
	            break;
	         }
	         else
	         {
	            last = middle-1;
	         }
	         middle = (first+last)/2;
	      }
	      
	      if(first>last)
	      {
	         System.out.println("\nThe element is not available in given array");
	      }
		}
	}


