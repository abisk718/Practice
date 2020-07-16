package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Book{
	public static void main(String args[]) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("ravi ");
		list.add("roja");
	Iterator value=list.iterator();
	while(value.hasNext()) {
		System.out.print(value.next());
	}
	}

}
