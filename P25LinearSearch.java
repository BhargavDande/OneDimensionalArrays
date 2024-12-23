package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P25LinearSearch {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int sz = ip.nextInt();
		int a[] = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter element : ");
			a[i] = ip.nextInt();
		}
		System.out.println("Given array is : " + Arrays.toString(a));
		System.out.println("enter element to search : ");
		int key = ip.nextInt();
		System.out.println(linearSearch(a, key) ? "Element found.." : "Element not found..");
	}

	public static boolean linearSearch(int a[], int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return true;
		}
		return false;
	}
}
