package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

// NOTE : Array Elements Should be in Ascending order
public class P31BinarySearchAlgorithm {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int sz1 = ip.nextInt();
		int a[] = new int[sz1];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter element : ");
			a[i] = ip.nextInt();
		}
		System.out.println("Given arr : " + Arrays.toString(a));
		System.out.println("Enter elem to search : ");
		int key = ip.nextInt();
		System.out.println(binarySearch(a, key) ? "Element found.." : "element not found..");
	}

	public static boolean binarySearch(int[] a, int key) {
		int low = 0, high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == a[mid])
				return true;
			else if (key < a[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return false;
	}
}
