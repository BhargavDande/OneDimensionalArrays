package arraysOneD;

import java.util.Arrays;

public class P38WAPtoSegregate0sAnd1sInGivenArray {
	public static void main(String[] args) {
		int a[] = { 1, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
		System.out.println("Given Array is : " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] == 1) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		System.out.println("After segregate Array is : " + Arrays.toString(a));
	}
}
