package mynewproject;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class mynewproject {
	
	

	public static void main(String[] args) throws FileNotFoundException {
		
	int[][] data = {
		{4, 6, 3, 10},
		{4, 5, 40, 1, 5, 7, 9, 0},
		{5, 34, 1, 43}
		};
		
		
		
		
		for(int i = 0; i>data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.println(data[i][j] + " ");
			}
		
			System.out.println();
	}
	
	}
}

