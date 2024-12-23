package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P30Print2ArrayElementsInZigzagManner {
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
		int i = 0;
		for (int k = 0; k < res.length;) {
			if (i < a.length) {
				res[k++] = a[i];
			}
			if (i < b.length) {
				res[k++] = b[i];
			}
			i++;
		}
		System.out.println("updated Array : " + Arrays.toString(res));
	}
}
