package com.globallogic.day1;

class Animalss{  
void eat(){
	System.out.println("eating...");}  
}  
class Dogi extends Animalss{  
void bark(){
	System.out.println("barking...");
	}  
	//System.out.println("eating...");
}  
class Caty extends Animalss{  
void meow(){
	System.out.println("meowing...");} 
	//System.out.println("eating...");
}  
class MyHierarchi{  
public static void main(String args[]){  
Caty c=new Caty();  
c.meow();  
c.eat();  

}} 
