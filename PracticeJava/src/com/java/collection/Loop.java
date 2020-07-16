package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Loop {
public static void main(String args[]) {
	
	ArrayList<String> obj=new ArrayList<String>();
	
      obj.add("car");
      obj.add("book");
      obj.add("bycycle");
      obj.add("Bike");
      
    //  for(int i=0;i<obj.size();i++) {
    //	  System.out.println(obj.get(i));// access size
     // }
      
//for-each
      
      //for (String i : obj) {
     //     System.out.println(i);
     //   }
    
  //sort   
      
      Collections.sort(obj); 
      for (String i : obj) {
          System.out.println(i);
        }
}
}

