package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P32RemoveDuplicatesInGivenArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int sz = ip.nextInt();
		int[] a = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter element : ");
			a[i] = ip.nextInt();
		}
		System.out.println("Given arr is : " + Arrays.toString(a));
		int res[] = removeDuplicateElem(a);
		System.out.println("Result arr is : " + Arrays.toString(res));
	}

	public static int[] removeDuplicateElem(int a[]) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != Integer.MIN_VALUE) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						c++;
						a[j] = Integer.MIN_VALUE;
					}
				}
			}
		}
		int res[] = new int[a.length - c];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != Integer.MIN_VALUE) {
				res[j] = a[i];
				j++;
			}
		}
		return res;
	}
}
