package arraysOneD;

import java.util.Scanner;
//2nd maximum Element in Array by using 2 loops
public class P20Print2ndMaximumElementInGivenArray {
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
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			max1 = a[i] > max1 ? a[i] : max1;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max2 && max1 != a[i]) {
				max2 = a[i];
			}
		}
		System.out.println("max1 is : " + max1);
		System.out.println("max2 is : " + max2);
	}
}
