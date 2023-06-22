package Generics;

import java.util.*;

class Gen<T>  //T is used to achieve typesafety in the class
{
	
	T obj;

	public Gen(T obj)  //constructor
	{
		this.obj= obj;  
	}
	
	void disp()
	{
		System.out.println("The type of data is : "+ obj.getClass().getName());
	}
	
	public T getObj()
	{
		return obj;
	}
}

public class Gentype
{

	public static void main(String[] args) 
	{
		Gen<Integer> g= new Gen<Integer>(10);
		g.disp();
		System.out.println(g.getObj());
		
		System.out.println("****************");
		
		Gen<String> g1= new Gen<String>("G5shivam");
		g1.disp();
		System.out.println(g1.getObj());
		
		
		

		

	}

}
