package arraysOneD;

import java.util.Arrays;
import java.util.Scanner;

public class P24PrintReverseOfAnArrayWithCreatingNewArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int sz = ip.nextInt();
		int a[] = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter element : ");
			a[i] = ip.nextInt();
		}
		System.out.println("Before reverse : " + Arrays.toString(a));
		int res[] = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			res[a.length - 1 - i] = a[i];
		}
		System.out.println("After reverse : " + Arrays.toString(res));
	}
}
