package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	public static void main (String args[]){

		/*
		 * ArrayList<String> mark=new ArrayList<>(); mark.add("english");
		 * mark.add("Science"); mark.add("Maths"); mark.add("tamil");
		 * 
		 * Iterator<String>total=mark.iterator();
		 * 
		 * System.out.println(total.next());// ans: english
		 * 
		 * 
		 * while(total.hasNext()) { System.out.println(total.next()); }
		 */
		 
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    Iterator<Integer> obj = numbers.iterator();
	    
	    while(obj   .hasNext()) {
	      Integer i = obj.next();
	      if(i < 10) {
	        obj.remove();
	      }
	    }
	    System.out.println(numbers);
	}

}
