package arraysOneD;

import java.util.Arrays;

public class P45Merge2ArraysInSortingOrderAndFindMedian {
	public static void main(String[] args) {
		int a[] = { 1, 2 };
		int b[] = { 4, 3 };
		int res[] = new int[a.length + b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			res[k++] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			res[k++] = b[i];
		}
		System.out.println("Before Sorting : " + Arrays.toString(res));
		// Bubble Sort
		for (int i = 0; i < res.length - 1; i++) {
			for (int j = 0; j < res.length - 1 - i; j++) {
				if (res[j] > res[j + 1]) {
					int temp = res[j];
					res[j] = res[j + 1];
					res[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sorting : " + Arrays.toString(res));
		int midInd = res.length / 2;
		if (midInd % 2 == 1) {
			System.out.println("median is : " + res[midInd] / 1.0);
		} else {
			System.out.println("median is : " + (res[midInd - 1] + res[midInd]) / 2.0);
		}
	}
}
