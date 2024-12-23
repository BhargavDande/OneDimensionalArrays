package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P37PrintSumOfPairedElementsIsEqualsToTarget {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a[] = { 1, 2, 3, 5, 6, 7 };
		System.out.println("Enter target value : ");
		int t = ip.nextInt();

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == t) {
					int res[] = new int[2];
					res[0] = a[i];
					res[1] = a[j];
					System.out.println(Arrays.toString(res));
					// System.out.println(a[i]+" "+a[j]);
					System.out.println("indexes are : " + i + " and " + j);
					// return;
				}
			}
		}
	}
}
