/*  Write a Java program that determines whether a given array of integers is monotonic. 
    An array is considered monotonic if it is either entirely non-decreasing 
    (each element is greater than or equal to the previous one) or entirely non-increasing
    (each element is less than or equal to the previous one).                    */

package arraysOneD;

public class P46PrintArrayIsMonotonicOrNot {
	public static void main(String[] args) {
		int a[] = { 6, 5, 4, 4 };
		isMonotone(a);
	}

	public static void isMonotone(int a[]) {
		boolean b = true;
		if (a[0] > a[a.length - 1]) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] < a[i + 1]) {
					b = false;
					break;
				}
			}
		} else {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					b = false;
					break;
				}
			}
		}
		System.out.println(b);
	}
}
