package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class Q41 {

	public static void removeZeros(ArrayList<Integer> array) {
		for (int i=0; i<array.size(); i++)
		{
			if(array.get(i)==0)
			array.remove(i);
		}
	}
}

