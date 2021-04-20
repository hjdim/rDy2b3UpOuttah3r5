package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Q41Test {

	/*
	 * Declaring ArrayLists for testing the removeZeros method
	 */
	
	ArrayList<Integer> list1= new ArrayList<>();
	ArrayList<Integer> list2= new ArrayList<>();
	ArrayList<Integer> list3= new ArrayList<>();
	
	@Test
	@DisplayName("list 1")
	public void removeZerosTest() {
		
		list1.add(0);
		list1.add(7);
		list1.add(2);
		list1.add(0);
		list1.add(4);
		list1.add(0);
		Q41.removeZeros(list1);
		assertEquals("[7, 2, 4]", list1.toString());
	
		list2.add(0);
		Q41.removeZeros(list2);
		assertEquals("[]", list2.toString());
		
		list3.add(1);
		list3.add(0);
		list3.add(2);
		list3.add(0);
		list3.add(3);
		list3.add(0);
		list3.add(4);
		list3.add(0);
		list3.add(5);
		Q41.removeZeros(list3);
		assertEquals("[1, 2, 3, 4, 5]", list3.toString());
	}


	

	
	
	
}
