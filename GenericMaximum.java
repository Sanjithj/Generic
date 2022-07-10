package com.bridgelabz;

public class GenericMaximum<T extends Comparable<T>>
	{
	T[] vals;
	 GenericMaximum(T[] o) 
	{ 
	vals = o;
	}
	public T max() 
	{
	T v = vals[0];
	for(int i=1; i < vals.length;i++)
	if(vals[i].compareTo(v) > 0) 
	v = vals[i];
	return v;
	}
	}
	class Testcase
	{
	public static void main(String args[])
	{
	Integer inums[]={10,2,5,4,6,1};
	 GenericMaximum<Integer> iob = new  GenericMaximum<Integer>(inums);
	System.out.println("Max value in inums: " + iob.max());
	
	}
	}
