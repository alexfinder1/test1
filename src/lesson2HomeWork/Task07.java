package lesson2HomeWork;

import java.util.Arrays;

/**
 * 7.	Посчитать количество элементов больше нуля
 */
public class Task07 {
	public static void main(String[] args) {
		int data[][] = { { 0 }, { 0, 1, 3, 5, 6 }, { 9, -1, 6, 0, 0, 0, 0, 0, 4, -1 }, { 0, 7, -4, 6, 0, 0, 4, 6 }, };
		for (int arr[] : data) {
			System.out.println();
			System.out.println("=========Number of elements >0=========");
			System.out.println(Arrays.toString(arr) + "-->");
			int j = arrayBiggerThan0(arr);
			System.out.printf("You can find the digit >0 %d times", j);

		}
	}

	private static int arrayBiggerThan0(int[] data) {
		int j = 0;
		int index = data.length - 1;
		while (index >= 0) {
			if (data[index] > 0) {
				j++;
			}
			index--;
		}
		return j;
	}
}
