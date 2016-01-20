package lesson2HomeWork;

import java.util.Arrays;

/**
 * 3.	Найти минимальный элемент, значение и индекс
 */
public class Task03 {
	
	public static void main(String[] args) {
		int[][] data1 = { 
				{ 0, 2, 4, 6, 8, 10, 12, 14 }, 
				{ 1, 3, 5, 7 },
				{ 2, 4 },
				{-1,-5,-7,-9,0,3,6,8}
		};
		for (int[] arr : data1) {
			System.out.println();
			System.out.println("=========Min array element=========");
			System.out.println(Arrays.toString(arr) + "-->");
			arraymin(arr);
		}
	}
	
	public static void arraymin(int[] data) {
		int minelement=0;
		int minindex=0;
		for (int index = 0; index <= data.length - 1; index++) {
			if (minelement>data[index]){
				minelement=data[index];
				minindex=index;
			}
		}
		System.out.println("Min Element= " + minelement + " Index= " + minindex);
	}

}
