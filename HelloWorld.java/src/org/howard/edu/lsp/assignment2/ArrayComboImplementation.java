package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;
//Joshua Hector
//Assignment #2 - Combination Array Algorithm
//Spring 2021 

//Process - used the "do it yourself" optimization and solve technique to come to this solution - technique involves running the algorithm by hand to derive a solution
//came to a recursive conclusion that would clear a seperate array to hold the current sums that were produced.
//defined functions to eleminate the confusion of multiple print statements and seperate sum exceptions
//reference material to help with the logic of this algorithm
//logic insipration from the "recursive combinations of all possible sums" algorithm that I was aware of in Python
//https://www.youtube.com/watch?v=NdF1QDTRkck - stanford abstract programming lecture
//stack overflow for java syntax and static language help - (I am a python programmer)


public class ArrayComboImplementation {
	
	// sumPossible is true when sum is possible with the elements from 0 to i
	// i represents element and j represents the sum
	   static boolean[][] sumPosible;
	   
	   //function to help with printing the display for the output
	   static void visual(ArrayList<Integer> displayHelp)
	   {
	       System.out.println(displayHelp);
	   }

	   //function that uses recursion to print the subsets
	   //use a vector to store the current subset
	   static void printSets(int arr[], int i, int sum,
	           ArrayList<Integer> p)
	   {
	       //if we finish the array and the sum is not zero:
		   //print the arraylist if the zero element of array is the sum and sumPossible is true
	       if (i == 0 && sum != 0 && sumPosible[0][sum])
	       {
	           p.add(i);
	           visual(p);
	           p.clear();
	           return;
	       }

	       // sum = 0
	       if (i == 0 && sum == 0)
	       {
	           visual(p);
	           p.clear();
	           return;
	       }

	       //if sum is possible through ignoring the current element
	       if (sumPosible[i-1][sum])
	       {
	           // redirect the array to a new one so that we can keep track of where we are in the arraylist
	           ArrayList<Integer> b = new ArrayList<>();
	           b.addAll(p);
	           printSets(arr, i-1, sum, b);
	       }

	       // using the current element can get us the sum
	       if (sum >= arr[i] && sumPosible[i-1][sum-arr[i]])
	       {
	           p.add(i);
	           printSets(arr, i-1, sum-arr[i], p);
	       }
	   }

	   // exception for: if the sum is 0, return the subset
	   static void printAllSubsetsAndExceptions(int arr[], int x, int sum)
	   {
	       if (x == 0 || sum < 0)
	           return;

	       // exception for: 0 elements means that the sum of the array is zero and only zero
	       sumPosible = new boolean[x][sum + 1];
	       for (int i=0; i<x; ++i)
	       {
	           sumPosible[i][0] = true;   
	       }
	       
	     
	       
	       // exception for: only one element in array
	       if (arr[0] <= sum)
	           sumPosible[0][arr[0]] = true;

	       // fill in all of sumPossible
	       for (int i = 1; i < x; ++i)
	           for (int j = 0; j < sum + 1; ++j)
	               sumPosible[i][j] = (arr[i] <= j) ? (sumPosible[i-1][j] ||
	                       sumPosible[i-1][j-arr[i]])
	                       : sumPosible[i - 1][j];
	               if (sumPosible[x-1][sum] == false)
	               {
	                   System.out.println("There are no subsets with" +
	                           " sum "+ sum);
	                   return;
	               }

	               // The recursive statement to continue this loop until all the subsets have been found
	               ArrayList<Integer> p = new ArrayList<>();
	               printSets(arr, x-1, sum, p);
	   }

	  
	}
