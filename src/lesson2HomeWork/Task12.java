package lesson2HomeWork;

import java.util.Arrays;

/**
 * 12.	Найти первый положительный элемент
 */
public class Task12 {
	public static void main(String[] args) {
		int data[][] = {
				//{}, 
				{ -1, -3, -5, 8 }, 
				{ 5, -4, 6, -100 },
				{-4,-4,6,8,11,123,0,-5},		
		};
		for  (int[] arr: data) {
			System.out.println();
			System.out.println("=========Find first positive===========");
			System.out.println(Arrays.toString(arr)+"-->");
			int index = arrayFirstPositive(arr);
			System.out.printf("The first positive element can be found at %d position",index);
		}
}

	private static int arrayFirstPositive(int[] arr) {
		int index=0;
		while((index<=arr.length-1) && (arr[index]<0) ) {
		index++;
		}
		return index;
	}
}
