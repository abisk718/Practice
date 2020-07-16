package com.java.collection;

import java.util.Iterator;
import java.util.PriorityQueue;


class QueueExample { 
    public static void main(String args[]){ 
        PriorityQueue<String> queue=new PriorityQueue<String>(); 
        // creating priority queue 
        queue.add("Amit"); 
        // adding elements 
        queue.add("Rachit");
        queue.add("Rahul"); 
        System.out.println("head:"+queue.element()); 
        System.out.println("head:"+queue.peek()); 
        System.out.println("iterating the queue elements:"); 
        Iterator itr1=(Iterator) queue.iterator(); 
            
        
		while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        queue.remove(); 
        queue.poll(); 
        
        System.out.println("after removing two elements:"); 
        Iterator<String> itr2=queue.iterator(); 
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}