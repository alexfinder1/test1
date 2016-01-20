package lesson2HomeWork;

import java.util.Scanner;

public class Task25 {
	/**
	 * Binary search in sorted array
	 */
	public static void binarysearch(int[] data) {
		System.out.println("Please enter the digit for search in array");
		int digit = Scan();
		System.out.println("You intered " + digit);
		int digitposition = rank(digit, data);
		System.out.println("Your digit can be found at position " + digitposition);
	}

	private static int rank(int val, int[] data) {
		// System.out.println(data.length);
		int mid = (data.length - 1) / 2;
		System.out.println("Medium position for array is " + mid);
		int index = 0;
		int foundindex = 0;
		if (val < data[mid]) {
			for (index = mid; index >= 0; index--) {
				if (val == data[index]) {
					foundindex = index;
				}
			}
		} else if (val > data[mid]) {
			for (index = mid; index <= data.length - 1; index++) {
				if (val == data[index]) {
					foundindex = index;
				}
				} 
			} else {
					foundindex = mid;
				}
			
		
		return (foundindex);
	}
	
	public static int Scan() {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int digit = scn.nextInt();
		return (digit);
	}
}
