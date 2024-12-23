//input : [1, 3, 5, 7]
//output : [1, 4, 9, 16]
package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P28PrintSumOfPreviousIndexElementsInEachIndex {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int sz = ip.nextInt();
		int a[] = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter element : ");
			a[i] = ip.nextInt();
		}
		System.out.println("Before sorting is : " + Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			a[i] = sum;
		}
		System.out.println("After updating : " + Arrays.toString(a));
	}
}
