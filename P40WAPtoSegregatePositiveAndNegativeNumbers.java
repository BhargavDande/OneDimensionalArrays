package arraysOneD;

import java.util.Arrays;

public class P40WAPtoSegregatePositiveAndNegativeNumbers {
	public static void main(String[] args) {
		int[] a = { 2, -10, 6, 3, -9, -6, -3, 1 };
		System.out.println("Given Array is : " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] > 0) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		System.out.println("After segregate Pos & Neg : " + Arrays.toString(a));
	}
}
