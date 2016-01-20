package lesson2HomeWork;

import java.util.Arrays;


/**
 * 6.	Посчитать количество элементов равных нулю
 * 
 */
public class Task06 {
	public static void main (String[] args) {
		int data [][] = {
				{0},
				{0,1,3,5,6},
				{9,-1,6,0,0,0,0,0,4,-1},
				{0,7,-4,6,0,0,4,6},
		};
	for (int arr [] : data) {
		System.out.println();
		System.out.println("=========Number of 0 element in array=========");
		System.out.println(Arrays.toString(arr) + "-->");
		int j= arrayEqual0(arr);
		System.out.printf("You can find the digit %d times",j);


	}
	}
	
private static int arrayEqual0 (int data[]) {
	int digit = 0;
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
	
}


