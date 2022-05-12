package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterSection {
	
	public static void main(String[] args) {
		
	//week3.day2 assignment2- Intersection of two arrays
		
		//Declare two arrays array1 and array2
		Integer[] array1 = new Integer[] { 3, 2, 11, 4, 6, 7 };
		Integer[] array2 = new Integer[] { 1, 2, 8, 4, 9, 7 };

		
        //convert array to list	and print both the lists	
		List<Integer> list1 = Arrays.asList(array1);
		List<Integer> list2 = Arrays.asList(array2);
		System.out.println("List1 :" + list1);
		System.out.println("List2 :" + list2);
  
		//convert the list1 into set
		Set<Integer> set1 = new HashSet<>(list1);
		
		//print Set1 
		//System.out.println("set1 :" +set1);
		
		//retain all the values of list2 in set1
		set1.retainAll(list2);
				
		//print set1		
		System.out.println("Intersection of array1 and array2 :" +set1);
		

	}

}
