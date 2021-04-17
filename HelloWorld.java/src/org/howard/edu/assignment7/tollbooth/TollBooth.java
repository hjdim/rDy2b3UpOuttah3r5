package org.howard.edu.assignment7.tollbooth;


interface TollBooth
{
   public void Display();
   public int CalcToll(Truck T);
} //TollBooth Interface

interface Truck 
{
   public int getAxles();
   public int getWeight();
} //Truck Interface










