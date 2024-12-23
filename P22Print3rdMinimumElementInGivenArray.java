package arraysOneD;

import java.util.Scanner;

public class P22Print3rdMinimumElementInGivenArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter size of an array : ");
		int sz = ip.nextInt();
		int a[] = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("enter element : ");
			a[i] = ip.nextInt();
		}
		int min1 = Integer.MAX_VALUE;
		int min2 = 0;
		int min3 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min1) {
				min3 = min2;
				min2 = min1;
				min1 = a[i];
			} else if (a[i] < min2 && min1 != a[i]) {
				min3 = min2;
				min2 = a[i];
			} else if (a[i] < min3 && min1 != a[i] && min2 != a[i]) {
				min3 = a[i];
			}
		}
		System.out.println("3rd min is : " + min3);
	}
}
