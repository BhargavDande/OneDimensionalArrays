package arraysOneD;

import java.util.Arrays;

public class P39WAPtoSegregateEvenAndOddElementsInGivenArray {
	public static void main(String[] args) {
		int[] a = { 3, 2, 17, 23, 36, 16 };
		System.out.println("Given Array is : " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] % 2 == 0) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		System.out.println("After Segregate EvenOdd Elem : " + Arrays.toString(a));
	}
}
