package com.java.sample;

interface FirstInterface {
	  public void myMethod(); // interface method
	}

	interface SecondInterface {
	  public void myOtherMethod(); // interface method
	}

	class DemoClass implements FirstInterface, SecondInterface {
		
	  public void myMethod() {// FirstInterface implement method
	    System.out.println("Some text..");
	  }
	  
	  public void myOtherMethod() {// SecondInterface implement method
	    System.out.println("Some other text...");
	  }
	}

	class MyMainClass {
	  public static void main(String[] args) {
	    DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	  }
	}