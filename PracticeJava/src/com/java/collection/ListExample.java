package com.java.collection;

import java.util.Arrays;
import java.util.List;

public class ListExample {
 public static void main(String []args) {
		/*
		 * List<Integer> list=Arrays.asList(1,4,6,2); for(Integer integer:list) {
		 * System.out.println(integer); }
		 */
	 System.out.println("Sorting with natural order");
     List<String> l1 = createList();
     l1.sort(null);
     l1.forEach(System.out::println);

     System.out.println("Sorting with a lamba expression for the comparison");
     List<String> l2 = createList();
     l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));  // sort ignoring case
     l2.forEach(System.out::println);

     System.out.println("Sorting with a method references");
     List<String> l3 = createList();
     l3.sort(String::compareToIgnoreCase);
     l3.forEach(System.out::println);

 }

 private static List<String>  createList() {
     return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
	 
 }
}
