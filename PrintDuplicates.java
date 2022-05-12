package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicates {

	// week3.day2 Assignemnt3.3 - Print the duplicate values

	public static void main(String[] args) {

		Integer[] text = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		
		List<Integer> list1 = Arrays.asList(text);
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for (int i = 0; i <= list1.size() - 1; i++) {
			if (list2.contains(list1.get(i))) {
				System.out.println(list1.get(i));
			} else {
				list2.add(list1.get(i));
			}
		}
	}
}
