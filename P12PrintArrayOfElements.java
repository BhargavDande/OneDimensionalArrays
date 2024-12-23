package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P12PrintArrayOfElements {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = ip.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("enter element at a[" + i + " ] : ");
			a[i] = ip.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}
}
