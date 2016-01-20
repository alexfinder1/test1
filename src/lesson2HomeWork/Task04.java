package lesson2HomeWork;
/**
 * 4.	Найти среднее значение элементов массива
 */
import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {
		int[][] data1 = { 
				{ 0, 2, 4, 6, 8, 10, 12, 14 }, 
				{ 1, 3, 5, 7 },
				{ 2, 4 },
				{-1,-5,-7,-9,0,3,6,8}
		};
		for (int[] arr : data1) {
			System.out.println();
			System.out.println("==========Average array element===========");
			arrayAverage(arr);
		}
	}
	private static void arrayAverage(int[] data) {
		checkEmpty(data);
		checkNull(data);
		int sum = 0;
		for (int index = 0; index <= data.length - 1; index++) {
			sum = sum + data[index];
		}
		int average = sum / (data.length - 1);
		System.out.println("The average element for this array = " + average);
	}
	 static void checkEmpty(int[] array) {
	        if( array.length == 0 ){
	            throw new IllegalArgumentException("array is empty");
	        }
	    }
	    static void checkNull(int[] array) {
	        if( array == null  ){
	            throw new IllegalArgumentException("array is null");
	        }
	    }
}
