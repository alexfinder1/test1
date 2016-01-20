package lesson2HomeWork;

import java.util.Arrays;

/**
 * 2.	Найти максимальный элемент, значение и индекс
 */
public class Task02 {
	public static void main(String[] args) {
		int data[][] = {
				{},
				{ 1, 3, 5, 8 },
				{ 5, -4, 6, -100 },
				};
		for (int arr[] : data) {
			System.out.println(Arrays.toString(arr) + "->");
			System.out.println("======Max element and index========");
			arraymax(arr);
		}

	}
	public static void arraymax(int[] data) {
		int maxelement=0;
		int maxindex=0;
		for (int index = 0; index <= data.length - 1; index++) {
			if (data[index]>maxelement){
				maxelement=data[index];
				maxindex=index;
			}
		}
		System.out.println("Max Element= " + maxelement + " Index= " + maxindex);
	}
}
