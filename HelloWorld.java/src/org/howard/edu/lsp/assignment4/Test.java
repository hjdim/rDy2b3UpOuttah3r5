package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;


public class Test{

   public static void main(String[] args) throws ListEmpty{
      
ArrayList<Integer> list1= new ArrayList<>();
ArrayList<Integer> list2= new ArrayList<>();

  
/*
 * Create implementation sets for testing purposes
 */
Implementation set1= new Implementation(list1);
Implementation set2= new Implementation(list2);

 
set1.add(1);
set1.add(3);
set1.add(4);
set1.add(6);
set1.add(8);
set1.add(7);
  
set2.add(1);
set2.add(2);
set2.add(3);
set2.add(4);
set2.add(5);
set2.add(6);
set2.add(7);
 
/**
 * Tests of the Integerset methods
 */

/**
 * Unmodified set1
 */
System.out.println("Starting set1: "+set1.returnlist());
System.out.println(" ");
/**
 * toString test
 */
System.out.println("ArrayList to String: "+set1.toString());
System.out.println(" ");
/**
 * isEmpty test
 */
System.out.println("isEmpty of set1: "+set1.isEmpty());
System.out.println(" ");
/**
 * length test
 */
System.out.println("Length of set1 : "+set1.length());
System.out.println(" ");
/**
 * equals test
 */
System.out.println("Equals Method: "+set1.equals(set2));
System.out.println(" ");
/**
 * contains test
 */
System.out.println("Contains method (0): "+set1.contains(0));
System.out.println(" ");
System.out.println("Contains method (7): "+set1.contains(7));
System.out.println(" ");
/**
 * largest and smallest without exception throw test
 */
System.out.println("Largest number in set: "+set1.largest());
System.out.println(" ");
System.out.println("Smallest number in set: "+set1.smallest());
System.out.println(" ");
/**
 * add test
 */
set1.add(20);
System.out.println("Num 20 added to set1: "+set1.returnlist());
System.out.println(" ");
/**
 * remove test
 */
set1.removeItem(3);
System.out.println("Number 3 removed from set1: "+set1.returnlist());
System.out.println(" ");
/**
 * union test
 */
System.out.println("Union of set1 and set2: "+(set1.union(set2)).returnlist());
System.out.println(" ");
/**
 * intersection test
 */
System.out.println("Intersection of set1 and set2: "+set1.intersection(set2).returnlist());
System.out.println(" ");
/**
 *  set difference test
 */
System.out.println("Difference of set1 and set2: "+set1.difference(set2).returnlist());
System.out.println(" ");
/**
 * clear test
 */
set1.clear();
System.out.println("Cleared List: "+set1.returnlist());
System.out.println(" ");
/**
 * largest/smallest test throw exception
 */
System.out.println("Largest number in set: "+set1.largest());




      
   }
}
