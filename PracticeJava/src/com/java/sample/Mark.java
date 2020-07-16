package com.java.sample;

public abstract class Mark{
	//polymorphisam 
	   Mark(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	
	 class Honda extends Mark{  
	 void run(){System.out.println("running safely..");}  
	 }  
	
	 class TestAbstraction2{  
	 public static void main(String args[]){  
	  Mark obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  

}
