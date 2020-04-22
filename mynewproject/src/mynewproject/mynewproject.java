package mynewproject;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.LinkedList;

public class mynewproject {
	
	

	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Elwin");
		names.push("sue");
		names.push("Sally");
		
		System.out.println(names.pop());
		System.out.println(names.removeFirst());
		System.out.println(names.remove());
	
	}
}

