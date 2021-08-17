package projekt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5,2,1,9,2,4,10,0,1,1,4));
		
		/*
		 * Ex.1 - Sorting numbers with duplicates.
		 * Ex.2 - Sorting numbers without duplicates.
		 * Ex.2 (Bonus SET) - Sorting numbers without duplicates using SET.
		 */
		
		System.out.println("Ex.1: " + sortWithDuplicates(numbers));
		System.out.println("Ex.2: " + sortWithoutDuplicates(numbers));
		System.out.println("Ex.2 (Bonus SET): " + sortWithoutDuplicatesUsingSet(numbers));
		
	}
	
	
	public static List<Integer> sortWithDuplicates(List<Integer> list) { 
		
		List<Integer> newNumbers = new ArrayList<>(list);
		
		Collections.sort(newNumbers);
		
		return newNumbers;
		
		
	}
	
	public static List<Integer> sortWithoutDuplicates(List<Integer> list) { 
		
		List<Integer> newNumbers = new ArrayList<>();
		
		for(Integer element : list) { 
			if(!newNumbers.contains(element)) { 
				newNumbers.add(element);
			}
		}
		
		Collections.sort(newNumbers);
		
		return newNumbers;
		
	}
	
	public static Set<Integer> sortWithoutDuplicatesUsingSet(List<Integer> list) { 
		Set<Integer> newNumbers = new TreeSet<>(list);
		
		return newNumbers;
	}


}
