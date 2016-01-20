package lesson2HomeWork;
/**
 * 8.	Помножить элементы массива на числ
 */
import java.util.Arrays;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		int data[][] = {
				{},
				{1,3,5,8},
				{ 5, -4, 6, -100 }, };
		for (int arr[] : data) {
			
			System.out.println("=======Multiply array to digit=========");
			System.out.println(Arrays.toString(arr) + " --> ");
			int data1[] = multiplyToDigit(arr);
			System.out.println("-->"+Arrays.toString(data1));
		}
	}

	private static int[] multiplyToDigit(int[] arr) {
		int data1[]=arr;
		int digit=Scan();
		for (int index=0; index<=arr.length-1; index++){
			data1[index]=digit*arr[index];
		}
		return data1;
	}

	private static int Scan() {
		System.out.println("Enter the digit to multiply array");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int digit = scn.nextInt();
		return digit;
	}
}


