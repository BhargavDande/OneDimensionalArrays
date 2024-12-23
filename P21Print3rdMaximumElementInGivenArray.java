package arraysOneD;

import java.util.Scanner;

public class P21Print3rdMaximumElementInGivenArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter size of an array : ");
		int sz = ip.nextInt();
		int a[] = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("enter element : ");
			a[i] = ip.nextInt();
		}
		int max1 = Integer.MIN_VALUE;
		int max2 = 0;
		int max3 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = a[i];
			} else if (a[i] > max2 && max1 != a[i]) {
				max3 = max2;
				max2 = a[i];
			} else if (a[i] > max3 && max1 != a[i] && max2 != a[i]) {
				max3 = a[i];
			}
		}
		System.out.println("3rd max is : " + max3);
	}
}
