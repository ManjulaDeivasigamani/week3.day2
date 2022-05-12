package week3.day2;

import java.util.Arrays;
import java.util.List;

public class MissingElement {
	public static void main(String[] args) {

		// week3.day2 assignment3.2 - MissingElement in an array

		Integer[] num = new Integer[] { 1, 3, 2, 4, 6, 7 };
		
		//convert array to list
		List<Integer> list = Arrays.asList(num);
		
		//sort list
		list.sort(null);
		
		//find missing element using loop
		for (int i = 0; i <list.size(); i++) {
			if (list.get(i).equals(i + 1)) {
				continue;
			}

			else {
				System.out.println("Missing element in given array is: " +(i + 1));
				break;
			}

		}

	}

}
