package org.howard.edu.lsp.assignment6.junit;

import org.howard.edu.lsp.assignment6.integerset.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.*;


public class IntegerSetTest {
	
	/*
	 * Declaring IntegerSets for testing 
	 * My IntegerSet class needs to initialize an empty ArrayList to work
	 */
	ArrayList<Integer> list1= new ArrayList<>();
	ArrayList<Integer> list2= new ArrayList<>();
	ArrayList<Integer> list3= new ArrayList<>();
	private IntegerSet testSet= new IntegerSet(list1);
	private IntegerSet testSet2= new IntegerSet(list2);
	private IntegerSet testSet3= new IntegerSet(list3);
	
	
	
	//Testing Starts Here
	
	/*
	 * ADD TEST
	 */
	@Test
	@DisplayName("Add test")
	public void testAdd() {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		
		assertEquals("[1, 2, 3]", testSet.toString());
		
		testSet.add(4);
		testSet.add(5);
		testSet.add(6);
		testSet.add(7);
		testSet.add(8);
		testSet.add(9);
		testSet.add(10);
		testSet.add(11);
		testSet.add(12);
		
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]", testSet.toString());
		
		testSet.add(13);
		testSet.add(14);
		testSet.add(15);
		testSet.add(16);
		testSet.add(17);
		testSet.add(18);
		testSet.add(19);
		
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]", testSet.toString());
		
		//if numbers are already present they are not added
		
		testSet.add(13);
		testSet.add(14);
		testSet.add(15);
		testSet.add(16);
		testSet.add(17);
		testSet.add(18);
		testSet.add(19);
		
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]", testSet.toString());

	}//test add method
	
	
	/*
	 * CLEAR TEST
	 */
	@Test
	@DisplayName("Clear test")
	public void testClear() {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		
		testSet.clear();
	
		assertEquals("[]", testSet.toString());
	}//test clear method
	
	
	/*
	 * LENGTH TEST
	 */
	@Test
	@DisplayName("length test")
	public void testLength() {
		
		assertEquals(0, testSet.length());
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		
		assertEquals(3, testSet.length());
		
		testSet.add(4);
		testSet.add(5);
		testSet.add(6);
		testSet.add(7);
		testSet.add(8);
		testSet.add(9);
		testSet.add(10);
		
		assertEquals(10, testSet.length());	
	}//test Length method
	
	
	/*
	 * EQUALS TEST
	 */
	@Test
	@DisplayName("Equals test")
	public void testEquals() {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		
		assertEquals(true, testSet.equals(testSet2));
		
		//Testing single number IntegerSets
		testSet.clear();
		testSet2.clear();
		
		testSet.add(0);
		
		testSet2.add(0);
		
		assertEquals(true, testSet.equals(testSet2));
		
		//Testing empty IntegerSets
				testSet.clear();
				testSet2.clear();
						
				assertEquals(true, testSet.equals(testSet2));
		
	}//test equals method
	
	
	/*
	 * CONTAINS TEST
	 */
	@Test
	@DisplayName("Contains test")
	public void testContains() {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		
		assertEquals(true, testSet.contains(1));	
		assertEquals(false, testSet.contains(10));
	}//test contains method
	
	
	/*
	 * LARGEST TEST
	 */
	@Test
	@DisplayName("Largest test")
	public void testLargest() throws ListEmpty {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		
		assertEquals(3, testSet.largest());
		
	}//test Largest method
	
	
	/*
	 * SMALLEST TEST
	 */
	@Test
	@DisplayName("Samllest test")
	public void testSmallest() throws ListEmpty {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);

		assertEquals(1, testSet.smallest());
		
	}//test Smallest method
	
	
	/*
	 * REMOVE ITEM TEST
	 */
	@Test
	@DisplayName("Remove Item")
	public void testRemoveItem() {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		
		testSet.removeItem(3);
		
		assertEquals("[1, 2]", testSet.toString());	
		
	}//test RemoveItem method
	
	
	/*
	 * UNION TEST
	 */
	@Test
	@DisplayName("Union")
	public void testUnion() {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		
		testSet2.add(4);
		testSet2.add(5);
		
		testSet3.add(1);
		testSet3.add(2);
		testSet3.add(3);
		testSet3.add(4);
		testSet3.add(5);
		
		IntegerSet testUnionSet = testSet.union(testSet2);
		
		assertEquals(true, testUnionSet.equals(testSet3));
		assertEquals(false, testUnionSet.equals(testSet2));
		
	}// test Union method
	
	
	/*
	 * INTERSECTION TEST
	 */
	@Test
	@DisplayName("Intersection")
	public void testIntersection() {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		testSet.add(4);
		testSet.add(5);
		testSet.add(6);
		testSet.add(7);
		
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		testSet2.add(99);
		testSet2.add(78867);
		testSet2.add(5);
		
		IntegerSet testIntersectionSet = testSet.intersection(testSet2);
	
		assertEquals("[1, 2, 3, 4, 5]", testIntersectionSet.toString());
		
		//Test 2 - Intersections
		testSet.clear();
		testSet2.clear();
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		testSet.add(4);
		testSet.add(5);
		testSet.add(6);
		testSet.add(7);
		
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		testSet2.add(99);
		testSet2.add(78867);
		testSet2.add(5);
		testSet2.add(6);
		testSet2.add(7);
		testSet2.add(5);
		
		assertEquals("[1, 2, 3, 4, 5, 6, 7]", testIntersectionSet.toString());
		
	}// test Intersection Method
	
	
	/*
	 * DIFFERENCE TEST
	 */
	@Test
	@DisplayName("Difference")
	public void testDifference() {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		testSet.add(4);
		testSet.add(5);
		testSet.add(6);
		testSet.add(7);
		
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		
		IntegerSet testDifferenceSet = testSet.difference(testSet2);
	
		assertEquals("[5, 6, 7]", testDifferenceSet.toString());
		
		//Test 2 - Difference
		testSet.clear();
		testSet2.clear();
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		testSet.add(4);
		testSet.add(5);
		testSet.add(6);
		testSet.add(7);
		
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		testSet2.add(99);
		testSet2.add(78867);
		testSet2.add(5);
		testSet2.add(6);
		testSet2.add(7);
		testSet2.add(5);
		
		IntegerSet testDifferenceSet2 = testSet.difference(testSet2);
		
		assertEquals("[]", testDifferenceSet2.toString());
		
	}// test Intersection Method
	
	
	/*
	 * ISEMPTY TEST
	 */
	@Test
	@DisplayName("isEmpty")
	public void testIsEmpty() {
		
		assertEquals(true, testSet.isEmpty());
		
		testSet.add(1);
		
		assertEquals(false, testSet.isEmpty());
	}// test isEmpty Method
	
	
	/*
	 * TOSTRING TEST
	 */
	@Test
	@DisplayName("toString")
	public void testToString() {
		
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		testSet.add(4);
		testSet.add(5);
		testSet.add(6);
		testSet.add(7);
		
		assertEquals("[1, 2, 3, 4, 5, 6, 7]", testSet.toString());
		
	}// test toString Method
	
	
}//IntegerSetTest Class
