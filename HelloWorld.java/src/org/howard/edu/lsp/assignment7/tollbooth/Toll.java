package org.howard.edu.lsp.assignment7.tollbooth;


public class Toll implements TollBooth {
	public Toll()
	   {
	truckcount = 0;
	receipts = 0;
	}
	public int CalcToll(Truck T)
	   {
	int axles = T.getAxles();
	int weight = T.getWeight();

	/*
	 *  5 is the dollar amount per axle, 
	 *  weight is converted from kilograms half tons
	 *  and then multiplied by 10. The final addition is the 
	 *  total toll due
	 */
	int tollDue = 5*axles + 10*(weight/500); 
	System.out.println("Axels: "+ axles+ " axles");
	System.out.println("Weight: "+ weight + "kg" );
	truckcount = truckcount + 1;
	receipts = receipts + tollDue;
	System.out.print("Toll due: ");
	System.out.println(tollDue);
	return tollDue;
	} //CalcToll Method

	public void Display()
	   {
	System.out.println("Total Truck count: " + truckcount);
	System.out.println("Totals since last collection - Receipts: " + receipts);
	System.out.println("");
	}// Display Method
	
	public void reset()
	{
		System.out.println("Total Truck count: " + truckcount);
		System.out.println("Totals since last collection - Receipts: " + receipts);
		receipts = 0;
		System.out.println("The receipts have been reset to "+receipts);
		System.out.println("");
		
	}

	int receipts;
	int truckcount;
	}// TollBooth Class


