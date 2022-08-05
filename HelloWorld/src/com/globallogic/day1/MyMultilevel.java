package com.globallogic.day1;

class Animals{  
void eat(){
	System.out.println("eating...");}  
}  
class Cat extends Animals{  
void meaww(){
	System.out.println("meaww...");}  
}  
class BabyDog extends Cat{  
void weep(){
	System.out.println("weeping...");}  
}  
class MyMultilevel{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.meaww();  
d.eat();  
}}  

