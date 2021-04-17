package org.howard.edu.assignment7.tollbooth;

public class Trucks extends Toll implements Truck {
public Trucks(int axles, int weight)
   {
this.axles = axles;
this.weight = weight;
}
public int getAxles()
   {
       return axles;
   }
public int getWeight()
   {
       return weight;
   }
int axles;
int weight;
}// Trucks Class (Different from the Truck Class)
