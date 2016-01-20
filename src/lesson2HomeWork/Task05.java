package lesson2HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 5.	Посчитать количество элементов равных заданному
 * 
 */
public class Task05 {
	public static void main (String[] args) {
		int data [][] = {
				{1,3,5,6},
				{9,-1,6,4,-1},
				{4,7,-4,6,6,8,4,6},
		};
	for (int arr [] : data) {
		System.out.println();
		System.out.println("=========Number of equal element in array=========");
		System.out.println(Arrays.toString(arr) + "-->");
		int j= arrayEqual(arr);
		System.out.printf("You can find the digit %d times",j);


	}
	}
	
private static int arrayEqual (int data[]) {
	int digit = scan ();
	int index=data.length-1;
	int j=0;
	while (index>=0) {
		if (digit==data[index]) {
			j++;
		}
	index--;	
	}
			return (j);
	}
	


private static int scan() {
	System.out.println("Enter the digit within array scope");
	@SuppressWarnings("resource")
	Scanner scn = new Scanner(System.in);
	int digit = scn.nextInt();
	return (digit);
}


}


