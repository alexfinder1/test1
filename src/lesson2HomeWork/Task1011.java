package lesson2HomeWork;
/**
 * 10.	Обнулить четные по значению элементы массива
 * 11.	Обнулить элементы  с нечетным индексом.
 */
import java.util.Arrays;
public class Task1011 {

	public static void main(String[] args) {
		int data[][] = {
				{}, 
				{ 1, 3, 5, 8 }, 
				{ 5, -4, 6, -100 },
				};
		
		int data1[][] = {
				{}, 
				{ 1, 3, 5, 8 }, 
				{ 5, -4, 6, -100 },
				};
		
		for (int arr[] : data) {

			System.out.println("=======Zero Even Element of array=========");
			System.out.println(Arrays.toString(arr) + " --> ");
			int arr1[]= zeroEvenElemenofArray(arr);
			System.out.println("-->" + Arrays.toString(arr1));
		}
		for (int arr[] : data1) {

			System.out.println("=======Zero Odd Element of array=========");
			System.out.println(Arrays.toString(arr) + " --> ");
			int arr1[]= zeroOddElemenofArray(arr);
			System.out.println("-->" + Arrays.toString(arr1));
		}
	}

	private static int[] zeroEvenElemenofArray(int[] arr) {
		for ( int index=0; index<=arr.length-1; index++) {
			if (arr[index]%2==0) {
				arr[index]=0;
			}
		}
		return arr;
		
	}
	private static int[] zeroOddElemenofArray(int[] arr) {
		for ( int index=0; index<=arr.length-1; index++) {
			if (arr[index]%2==1) {
				arr[index]=0;
			}
		}
		return arr;
		
	}
}

