package Generics;

import java.util.*;

class Employee
{
	private String name;
	private int empId;
	
	public Employee(String name, int empId)
	{
		this.name=name;
		this.empId=empId;
	}
	
	public String toString()
	{
		return empId+" ";
	}
	
	//@override
	public void finalize()
	{
		System.out.println("Cleanup work by GC before deallocating m/m from heap");
	}
	
}


public class Weakhashmap
{

	public static void main(String[] args)
	{
		Employee e= new Employee("G5shivam",171);
		
		WeakHashMap hm = new WeakHashMap(); //now garbage collector will work
		hm.put(e,"G5shivam");
		System.out.println(hm);
		
		e=null;
		System.gc(); //calling garbage collector which will call to finalize method
		System.out.println(hm);
        System.out.println("Last Line");
		
	}

}

