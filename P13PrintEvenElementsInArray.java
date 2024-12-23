package arraysOneD;

import java.util.Scanner;

public class P13PrintEvenElementsInArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = ip.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("enter elem at " + i + " th index : ");
			a[i] = ip.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + ", ");
			}
		}
	}
}
