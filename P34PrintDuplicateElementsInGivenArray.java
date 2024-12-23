package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P34PrintDuplicateElementsInGivenArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int sz = ip.nextInt();
		int[] a = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter element : ");
			a[i] = ip.nextInt();
		}
		System.out.println("Given arr is : " + Arrays.toString(a));
		printDuplicateElem(a);
	}

	public static void printDuplicateElem(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			if (a[i] != Integer.MIN_VALUE) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						c++;
						a[j] = Integer.MIN_VALUE;
					}
				}
				if (c > 0) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
