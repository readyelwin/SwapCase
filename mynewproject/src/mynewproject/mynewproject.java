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
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Elwin");
		names.push("sue");
		names.push("Sally");
		
		ListIterator<String> it = names.listIterator();
		it.next();
		it.next();
		it.add("Susan");
		
		
		
		
		names.add(2, "Susan" );	
		for(String s: names) {
			System.out.println(s);
		}
		
	
	}
}

