package com.bridgelabz;

public class GenericMaximum<T>{
	
	public <T extends Comparable<T>> void findmax(T t1,T t2,T t3) {
		if(t1.compareTo(t2)>0&&t1.compareTo(t3)>0) {
			System.out.println("T1 is maximum"+t1);
		}else if(t2.compareTo(t1)>0&& t2.compareTo(t3)>0) {
			System.out.println("T2 max="+t2);
		}
		else {
			System.out.println("T3 is max="+t3);
		}
	}
	
	public static <E> void main(String[] args) {
		GenericMaximum<E> genricobj=new  GenericMaximum<E>();
		genricobj.findmax(10, 12, 30);
		
	}

}
	