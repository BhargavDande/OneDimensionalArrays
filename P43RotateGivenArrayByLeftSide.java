package arraysOneD;

import java.util.Arrays;

public class P43RotateGivenArrayByLeftSide {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println("Given Arr is : " + Arrays.toString(a));
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}
		a[a.length - 1] = temp;
		System.out.println("After Left Shift Arr : " + Arrays.toString(a));
	}
}
