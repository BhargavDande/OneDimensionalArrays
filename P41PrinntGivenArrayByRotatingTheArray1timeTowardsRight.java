package arraysOneD;

import java.util.Arrays;

public class P41PrinntGivenArrayByRotatingTheArray1timeTowardsRight {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println("Given Arr is : " + Arrays.toString(a));
		int temp = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = temp;
		System.out.println("Result Arr is : " + Arrays.toString(a));
	}
}
