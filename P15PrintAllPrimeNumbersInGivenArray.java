package arraysOneD;

import java.util.Scanner;

public class P15PrintAllPrimeNumbersInGivenArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int sz = ip.nextInt();
		int[] a = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter a value in " + i + " th index : ");
			a[i] = ip.nextInt();
		}
		primeNumsOfArray(a);
	}

	public static void primeNumsOfArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i]))
				System.out.println(a[i]);
		}
	}

	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;
		}
		return c == 2;
	}
}
