package org.howard.edu.lsp.exam.question40;

public class Airplane implements Flying {

	   public Airplane() {  

	   }

	   @Override

	   public void fly() {

	       System.out.println("The "+getClass().getSimpleName() + " roars its engines across the sky to transport goods or people from point A to B.");

	   }

	}