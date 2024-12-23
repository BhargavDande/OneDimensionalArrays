package arraysOneD;

import java.util.Scanner;

public class P36PrintMoneyNotesRequiredForGivenAmount {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 1 };
		System.out.println("Enter amount : ");
		int m = ip.nextInt();
		for (int i = 0; i < notes.length; i++) {
			int q = m / notes[i];
			if (q > 0) {
				System.out.println(notes[i] + " => " + q);
				m = m - (notes[i] * q);
			}
		}
	}
}
