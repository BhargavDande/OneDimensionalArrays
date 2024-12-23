package arraysOneD;

import java.util.Scanner;

public class P16PrintMaximumElementInGivenArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int sz = ip.nextInt();
		int a[] = new int[sz];
		for (int j = 0; j < a.length; j++) {
			System.out.print("enter " + j + " element : ");
			a[j] = ip.nextInt();
		}
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			max = a[i] > max ? a[i] : max;
		}
		System.out.println("Max elem of array is : " + max);
	}
}
