package org.howard.edu.lsp.assignment4;



import java.util.*;

/**
 * Class Implementation is an IntegerSet class that includes its 
 * basic operations as defined by Homework Assignment #4 
 * in the large scale programming class of SPRING 2021
 * at Howard University
 */
public class Implementation{
	
	 /**
	  * Initialize an array list to use throughout the entire class
	  */
  
   ArrayList<Integer> list= new ArrayList<>();
  
   public Implementation(ArrayList<Integer> list) {
       this.list=list;
   }
  
  
  
   /**
    * Clears the set
    */
   public void clear() {
       list.clear();
   }
  
   /**
    * returns the length of the set
    */
  
   public int length() {
       return list.size();
   }
  
   /**
   * Returns true if the 2 sets are equal, false otherwise;
   * Two sets are equal if they contain all of the same values in ANY order.
   */
   public boolean equals(Implementation b) {
      
       ArrayList<Integer> list2=b.list;
         
       if(list.size()!=list2.size()) {
           return false;
       }
       ArrayList<Integer> a=list;
         
       ArrayList<Integer> c=list2;
         
       Collections.sort(a);
       Collections.sort(c);
         
       for(int i=0;i<a.size();i++) {
           if(a.get(i)!=c.get(i)) {
               return false;
           }
       }
         
       return true;
      
   }
   
   /**
    * Returns true if the set contains the value, otherwise false
    */
   public boolean contains(int value) {
	   for (int i =0; i < list.size();) {
		   if (list.contains(value)) {
			   return true;
		   }
		   else {}
		   return false;
	   }
	   return true;
   }
   
     
  
  /**
   * Returns the largest item in the set; Throws a IntegerSetException if the set is empty
   */
  
   public int largest() throws ListEmpty {
      
       if(list.size()==0) {
    	   throw new ListEmpty("You knew this list was empty, stop playing please.");
       }
      
       int max=0;
      
       for(int i=0;i<list.size();i++) {
           if(list.get(i)>max) {
               max=list.get(i);
           }
       }
      
       return max;
      
   }
  
   /**
    * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
    */
  
   public int smallest() throws ListEmpty {
      
	   if(list.size()==0) {
    	   throw new ListEmpty("You knew this list was empty, stop playing please.");
       }
      
       int min=Integer.MAX_VALUE;
      
       for(int i=0;i<list.size();i++) {
           if(list.get(i)<min) {
               min=list.get(i);
           }
       }
      
       return min;
      
   }
  
   /**
    * Adds an item to the set or does nothing it already there
    */
  
   public void add(int item ) {
      
       boolean exist=false;
      
       for(int i=0;i<list.size();i++) {
          
           if(list.get(i)==item) {
               exist=true;
           }
       }
      
       if(exist==false) {
           list.add(item);
       }
      
   }
  
   /**
    * Removes an item from the set or does nothing if not there
    */
  
   public void removeItem(int item ) {
      
      
      
       for(int i=0;i<list.size();i++) {
          
           if(list.get(i)==item) {
               list.remove(i);
           }
       }
      
   }
  
   /**
    * Combines sets and returns them as one set
    */
   public Implementation union(Implementation list2) {
      
       ArrayList<Integer> temp=list2.list;
      
       Set<Integer> set = new HashSet<>();
       set.addAll(list);
       set.addAll(temp);
      
       ArrayList<Integer> list3= new ArrayList<>(set);
      
       Implementation list4= new Implementation(list3);
      
       return list4;
      
   }
  
   /**
    * Finds the intersection of elements between two lists
    */
   public Implementation intersection(Implementation list2) {
      
       ArrayList<Integer> temp=list2.list;
      
       list.retainAll(temp);
      
       Implementation list4= new Implementation(list);
      
       return list4;
   }
  
   /**
    * Subtracts one set from another 
    */
   public Implementation difference (Implementation list2) {
      
       ArrayList<Integer> temp=list2.list;

       list.removeAll(temp);
      
       Implementation list4= new Implementation(list);
      
       return list4;
      
   }
  
   /**
    * Return true if the set is empty, false otherwise
    */
   
   public boolean isEmpty() {
	   return list.size() == 0;
   }
   
   /*
    * Return the integerset as an Array of strings
    */
   
   public String toString() {
	   return list.toString();
	   
   }
   
   
   /**
    * Function to return the actual list instead 
    * of an array list object for printing
    */
   public ArrayList<Integer>returnlist(){
	   return list;
   }
  
}


