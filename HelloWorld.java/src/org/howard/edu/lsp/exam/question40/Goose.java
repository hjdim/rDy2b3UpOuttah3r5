package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements Flying {

	   public Goose() {

	   }
	   
	   public void move() {

	       System.out.println("This Goose moves forward.");

	   }

	   public void speak() {

	       System.out.println("This Goose speaks.");

	   }  

	    

	   @Override

	   public void fly() {

	       System.out.println("The "+getClass().getSimpleName() + " is soaring through the air with its wings and hopefully not being a menace.");  

	   }

	}