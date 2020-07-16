package com.java.collection;

import java.util.HashMap;

public class Hash {
public static void main(String args[]) {
	HashMap<Integer, String> object=new HashMap<>();
	
	object.put(1, "raju");
	object.put(2, "venu");
	object.put(3, "rani");
	object.put(4, "kaja");
	object.put(5, "ram");
	
	System.out.println(object);//ans:{1=raju, 2=venu, 3=rani, 4=kaja, 5=ram}

	//access item
	System.out.println(object.get(1));// raju
	object.remove(5);
	System.out.println(object);//ans: {1=raju, 2=venu, 3=rani, 4=kaja}
	
	//size
	System.out.println(object.size());//ans :4
	//clear
	//object.clear();
	//System.out.println(object);//ans: {}
	
	for (Integer i : object.keySet()) {
		  System.out.println(i);
		}
	
	for (Integer i : object.keySet()) {
		  System.out.println("key: " + i + " value: " + object.get(i));
		}
} 

}
