package lesson2HomeWork;

/**
 * 9.	Прибавить к элементам массива их индекс
 */
import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {
		int data[][] = { {}, { 1, 3, 5, 8 }, { 5, -4, 6, -100 }, };
		for (int arr[] : data) {

			System.out.println("=======Add index to array=========");
			System.out.println(Arrays.toString(arr) + " --> ");
			int data1[] = adIndexToArray(arr);
			System.out.println("-->" + Arrays.toString(data1));
		}
	}

	private static int[] adIndexToArray(int[] arr) {
		int data1[] = arr;
		int index = arr.length - 1;
		while (index >= 0) {
			data1[index] = arr[index] + index;
			index--;
		}
		return data1;
	}

}
