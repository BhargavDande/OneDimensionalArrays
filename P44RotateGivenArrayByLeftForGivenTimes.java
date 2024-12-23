package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P44RotateGivenArrayByLeftForGivenTimes {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println("Given Arr is : " + Arrays.toString(a));
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n shifts : ");
		int n = ip.nextInt();
		while (n > 0) {
			rotateLeft(a);
			n--;
			System.out.println(Arrays.toString(a));
		}
	}

	public static void rotateLeft(int[] a) {
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}
		a[a.length - 1] = temp;
	}
}
