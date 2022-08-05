package com.globallogic.day5;
import java.util.*;


//Write a program to print a string entered by user.
//2.
//Write a program to input and display the sentence I love candies.
//3.
//Write a program to find the length of the string "refrigerator".
//4.
//Write a program to check if the letter 'e' is present in the word 'Umbrella'.
//5.
//Write a program to check if the word 'orange' is present in the "This is orange juice".
//6.

//Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".

//Write a program to find out the largest and smallest word in the string "This is an umbrella".

//Write a program to check if a given string is a Palindrome.

//A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.

//Write a program to replace a given substring in a sentence with another string. 
//For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, 
//the new sentence should be printed as ”A snowman with snow”.

//Write a program to reverse individual words in a string, where each word may be delimited by a dot, 
//comma, space or tab, like www.google.com should become www.elgoog.moc.

//Input a string which contains some palindrome substrings. Find out the position of palindrome 
//substrings if exist and replace it by *. (For example if input string is 
//“bob has a radar plane” then it should convert in “*** has a ***** plane”.


public class String_code {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String a= sc.next();
//		//printing user input
//		System.out.println(a);
//		
//		//length
//		System.out.println("length of string is : "+ a.length());
//		
//		//checking char
//		char c = 'e';
//		int flag=0;
//		for(int i=0;i<a.length();i++) {
//			if(a.charAt(i)==c)
//				flag =1;
//		}
//			
//		if(flag == 1)
//				System.out.println("'e' : is present in the letter");
//			
//		else
//				System.out.println("'e' is not present in the letter");
//		
		// word in a sentence
		
//		System.out.println("Enter String: ");
//		
//		String str = sc.nextLine();
//		System.out.println(str);
//		System.out.println(str.contains("orange"));
		
		//occurence
		
//		String str = sc.nextLine();
//		System.out.println("first occuence of char 'o': " + str.indexOf('o'));
//		System.out.println("last occuence of char 'o': " + str.lastIndexOf('o'));
//		System.out.println("first occuence of char ',': " + str.indexOf(','));
//		System.out.println("last occuence of char ',': " + str.indexOf(','));

		// string palindrome
		
//		System.out.println("Enter String 2: ");
//		String str2 = sc.nextLine();
//		String p ="";
//		for(int i = str2.length()-1; i>=0; i--) {
//			p=p+str2.charAt(i);
//		}
//		int i =0;
//		if(i == str2.compareTo(p))
//			System.out.println("Palindrome");
//		else
//			System.out.println("not palindrome");
		
		//replace word
		
		String s = sc.nextLine();
		String old = sc.next();
		String new1 = sc.next();
		String rep = s.replace(old, new1);
		System.out.println(rep);
		
		
	}
		
}
