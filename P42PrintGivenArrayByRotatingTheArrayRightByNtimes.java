package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P42PrintGivenArrayByRotatingTheArrayRightByNtimes {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println("Given Arr is : " + Arrays.toString(a));
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n shifts : ");
		int n = ip.nextInt();
		while (n > 0) {
			rotateRight(a);
			n--;
			System.out.println(Arrays.toString(a));
		}
	}

	public static void rotateRight(int a[]) {
		int temp = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = temp;
	}
}
