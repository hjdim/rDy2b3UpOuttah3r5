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
		   int arr3[] = {25, 345, 343, 12, 32, 76, 78, 544, 5479, 87};
	       int n3 = arr.length;
	       int sum3 = 44;
	       
	     //test case four
		   int arr4[] = {};
	       int n4 = arr.length;
	       int sum4 = 6;
	       
	     //test case five
		   int arr5[] = {1, 2, 3, 4, 5, 6};
	       int n5 = arr.length;
	       int sum5 = 0;
	       
	     //test case six 
		   int arr6[] = {1, 2, 3, 4, 5, 6};
	       int n6 = arr.length;
	       int sum6 = 6;
	       
	       //test case outputs
	       //test case 1
	       System.out.println("Array : "+Arrays.toString(arr));
	       System.out.println("Target : "+sum);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr, n, sum);
	       
	       //test case outputs
	       //test case 1
	       System.out.println("");
	       System.out.println("Array : "+Arrays.toString(arr2));
	       System.out.println("Target : "+sum2);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr2, n2, sum2);
	       
	       //test case outputs
	       //test case 1
	       System.out.println("");
	       System.out.println("Array : "+Arrays.toString(arr3));
	       System.out.println("Target : "+sum3);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr3, n3, sum3);
	       
	       //test case outputs
	       //test case 1
	       System.out.println("");
	       System.out.println("Array : "+Arrays.toString(arr4));
	       System.out.println("Target : "+sum4);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr4, n4, sum4);
	       
	       //test case outputs
	       //test case 1
	       System.out.println("");
	       System.out.println("Array : "+Arrays.toString(arr5));
	       System.out.println("Target : "+sum5);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr5, n5, sum5);
	       
	       //test case outputs
	       //test case 1
	       System.out.println("");
	       System.out.println("Array : "+Arrays.toString(arr6));
	       System.out.println("Target : "+sum6);
	       System.out.println("Combinations by index");
	       ArrayComboImplementation.printAllSubsetsAndExceptions(arr6, n6, sum6);
	   }



}
