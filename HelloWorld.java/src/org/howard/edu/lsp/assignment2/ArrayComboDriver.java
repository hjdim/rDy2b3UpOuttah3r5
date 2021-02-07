package org.howard.edu.lsp.assignment2;

import java.util.Arrays;


public class ArrayComboDriver {
	
	
	 //tester/driver to test the array combinations algorithm
	   public static void main(String args[])
	   {
		   
		   //test case variable assignments
		   //test case 1
		   int arr[] = {5, 5, 15, 10};
	       int n = arr.length;
	       int sum = 15;
		   
		   //test case two
		   int arr2[] = {1, 2, 3, 4, 5, 6};
	       int n2 = arr.length;
	       int sum2 = 6;
	       
	     //test case three
		   int arr3[] = {10, 12, 32, 50};
	       int n3 = arr.length;
	       int sum3 = 44;
	       
	  
	     //test case six 
		   int arr6[] = {1, 2, 3, 4, 5, 6};
	       int n6 = arr.length;
	       int sum6 = 5;
	       
	       //test case six 
		   int arr7[] = {50, 50,50,50, 100,100,  150, 200};
	       int n7 = arr.length;
	       int sum7 = 200;
	       
	       //test case outputs
	       //test case 1
	       System.out.println("Array : "+Arrays.toString(arr));
	       System.out.println("Target Sum : "+sum);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr, n, sum);
	       
	       //test case outputs
	       //test case 1
	       System.out.println("");
	       System.out.println("Array : "+Arrays.toString(arr2));
	       System.out.println("Target Sum : "+sum2);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr2, n2, sum2);
	       
	       //test case outputs
	       //test case 1
	       System.out.println("");
	       System.out.println("Array : "+Arrays.toString(arr3));
	       System.out.println("Target Sum  : "+sum3);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr3, n3, sum3);
	       
	       
	       //test case outputs
	       //test case 1
	       System.out.println("");
	       System.out.println("Array : "+Arrays.toString(arr6));
	       System.out.println("Target Sum : "+sum6);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr6, n6, sum6);
	       
	       //test case outputs
	       //test case 1
	       System.out.println("");
	       System.out.println("Array : "+Arrays.toString(arr7));
	       System.out.println("Target Sum : "+sum7);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr7, n7, sum7);
	       
	       
	       
	       System.out.println(" Issues that were never resolved: Adding negative values to the array. More than two occurences of a repeated number. The numbers not appearing in chronological order");
	      
	       
	   }



}
