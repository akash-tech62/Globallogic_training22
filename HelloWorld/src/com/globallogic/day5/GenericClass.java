package com.globallogic.day5;

class Student_1<X,Y,Z>
{
	X id;
	Y name;
	Z year;
	public Student_1(X id,Y name,Z year)
	{
		this.id=id;
		
		this.name=name;
		
		this.year=year;
	}
	public void print()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.year);
	}
}
public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_1<String,String,String> s1=new Student_1<String,String,String>("12","Akash","2001");
		Student_1<Integer,String,Integer> s2=new Student_1<Integer,String,Integer>(121,"Akash",12112);
		s1.print();
		s2.print();
		s1.toString();
		s2.toString();

	}
	

}