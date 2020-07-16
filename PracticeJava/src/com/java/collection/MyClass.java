package com.java.collection;

import java.util.ArrayList;

public class MyClass {
		
	//Create an ArrayList object called "Cars" that will Store String
     //ArrayList<String> cars=new ArrayList<String>();
	
	
//add Items 
	  
	  public static void main(String args[]) {
	  ArrayList<String>cars=new ArrayList<String>();
	  
	  cars.add("bike");
	  cars.add("Scooter"); 
	  cars.add("Auto"); 
	  System.out.println(cars);     //ans: [bike, Scooter, Auto]
	  
//access an items
	  System.out.println(cars.get(1));
	  System.out.println(cars.get(2));//ans:  Scooter 
	                                     //   Auto

	  
//change Items 
	  cars.set(0, "Lorry");
	    System.out.println(cars);//ans:  [Lorry, Scooter, Auto]
	  
	 
 // remove items
	  cars.remove(0);
	  System.out.println(cars);//ans:  [ Scooter, Auto]
	
	  
 //clear items
	 // cars.clear();
	 //   System.out.println(cars); //ans: []
	    
//array List Size
	    System.out.println(cars.size());// ans: 2
} 
}

