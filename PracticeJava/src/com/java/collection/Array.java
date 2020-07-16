package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
	public static void main(String args[]) {
		
		ArrayList<String>list=new ArrayList<String>();
		list.add("ravi ");
		list.add("roja");
	
		Iterator value=list.iterator();
	while(value.hasNext()) {
		System.out.print(value.next());
	}
	}

}
