package lesson2HomeWork;

import java.util.Arrays;

/**
 * 1.	Найти сумму элементов массива
 */
public class Task01 {
	public static void main(String[] args) {
		int data[][] = {
				{},
				{ 1, 3, 5, 8 },
				{ 5, -4, 6, -100 },
				};
		for (int arr[] : data) {
			System.out.println(Arrays.toString(arr) + "->");
			System.out.println("========Sum of array elements=========");
			arraysum(arr);
		}

	}

	public static void arraysum(int[] data) {
		int sum = 0;
		for (int index = 0; index <= data.length - 1; index++) {
			sum = sum + data[index];
		}
		System.out.println("Array= " + sum);
	}
}
