package lesson2HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BiggerorSmaller {

	public static void main(String[] args) {
		int digit = generate();
		System.out.println("Your digit has been randomised successfully");
		digitsearch(digit);
	}

	private static int generate() {
		int minDigit = 0;
		int maxDigit = 100;
		Random r = new Random();
		int digit = r.nextInt(maxDigit - minDigit + 1) + minDigit;
		return (digit);
	}

	private static void digitsearch(int digit) {
		int guessdigit = 0;
		int index = 0;

		System.out.println("Guess the digit from 0 to 100 and enter it ");
		List<Integer> num1 = new ArrayList<Integer>(101);

		while (guessdigit != digit) {

			guessdigit = Scan();
			num1.add(index, guessdigit);
			System.out.print(" Your previos attempts: ");
			System.out.println();
			for (int i = 0; i < num1.size(); i++) {
				System.out.print(" " + num1.get(i));
			}
			;
			if (guessdigit > digit) {
				System.out.println();
				System.out.println(" Your should try SMALLER one and guess again ");
			}
			if (guessdigit < digit) {
				System.out.println();
				System.out.println(" Try BIGGER one and guess again ");
			}
			if (guessdigit == digit) {
				System.out.println();
				System.out.println("You are right its " + guessdigit);
			}
			index++;
		}
	}
	public static int Scan() {
		Scanner scn = new Scanner(System.in);
		int guessdigit = scn.nextInt();
		return (guessdigit);
	}
}
