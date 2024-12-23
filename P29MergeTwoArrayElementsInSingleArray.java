package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P29MergeTwoArrayElementsInSingleArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size of an 1st array : ");
		int sz1 = ip.nextInt();
		int a[] = new int[sz1];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter element : ");
			a[i] = ip.nextInt();
		}
		System.out.println("Enter size of 2nd array : ");
		int sz2 = ip.nextInt();
		int b[] = new int[sz2];
		for (int i = 0; i < b.length; i++) {
			System.out.print("Enter elem : ");
			b[i] = ip.nextInt();
		}
		System.out.println("First Arr : " + Arrays.toString(a));
		System.out.println("First Arr : " + Arrays.toString(b));
		int[] res = new int[a.length + b.length];
		for (int i = 0; i < res.length; i++) {
			if (i < a.length) {
				res[i] = a[i];
			} else {
				res[i] = b[i - a.length];
			}
		}
		System.out.println("Result arr : " + Arrays.toString(res));
	}
}
