package org.howard.edu.assignment7.junit;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.howard.edu.assignment7.tollbooth.*;

public class TollboothTest {
	

	Toll booth = new Toll();
	
	Trucks ford = new Trucks(5, 12500);
	Trucks nissan = new Trucks(2,5000);
	Trucks daewoo = new Trucks(6, 17000);
	
	
	/*
	 * Test cases in JUnit5
	 */
	
	@Test
	@DisplayName("Truck Toll Calculations and Display")
	public void CalcToll() {
		assertEquals(275, booth.CalcToll(ford));
		booth.Display();
		assertEquals(110, booth.CalcToll(nissan));
		booth.Display();
		assertEquals(370, booth.CalcToll(daewoo));
		booth.Display();
	}
	
	@Test
	@DisplayName("Reset reciepts Test")
	public void Reset() {
		
		assertEquals(275, booth.CalcToll(ford));
		booth.Display();
		assertEquals(110, booth.CalcToll(nissan));
		booth.reset();
		assertEquals(370, booth.CalcToll(daewoo));
		booth.Display();
	}
		
}
