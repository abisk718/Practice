package com.java.collection;

import java.util.ArrayList;
import java.util.List;

class Container<T extends Number>{//T specified integer class Container<T>{//T specified integer T value ;}
		               //Value can be integer, float and string
	                   //but at the time create object of container is integer. If, future use float not support this type.
	T value ;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.print(value.getClass().getName());
	}
	//public void demo( ArrayList<? extends T>obj) {
		
	//}
  public void demo( ArrayList<? super T>obj) {
		// super class support all super class
	}
	
}
public class GenericsDemo {
public void main (String args[]) {
	Container<Integer>obj=new Container<>();
	
	obj.show();
	obj.demo(new ArrayList<Integer>());
	
		/*  
		 * int value=5;
		 * List values= new ArrayList();  //values is number. but add string and integer values. So, get error in run time. this problem over come used List
		 *  values.add(7); 
		 *  values.add("Jothi");
		 *   int i= Integer.parseInt(values.get(1).toString()); System.out.println("i");
		 */
	
	
}
}
