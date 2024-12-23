package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P33PrintFrequencyOfEachElementInGivenArray {
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
		frequencyOfEachElem(a);
	}

	public static void frequencyOfEachElem(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != Integer.MIN_VALUE) {
				int c = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						c++;
						a[j] = Integer.MIN_VALUE;
					}
				}
				System.out.println(a[i] + " => " + c);
			}
		}
	}
}
