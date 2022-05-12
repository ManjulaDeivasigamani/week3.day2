package week3.day2;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// week3.day2 assignment3.2 - Find second largest value in an array

		Integer[] num = new Integer[] { 3, 2, 11, 4, 6, 7 };
		
		//convert array to list, sort list and print list values		
		List<Integer> list = Arrays.asList(num);
		list.sort(null);		
		System.out.println(list);
		
		//get the second largest value and print it	
		Integer secndLargst = list.get(list.size() - 2);		
		System.out.println("Second largest value : " +secndLargst);

	}

}
