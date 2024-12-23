package arraysOneD;

import java.util.Scanner;

public class P18PrintAverageOfEvenNumbersInGivenArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int sz = ip.nextInt();
		int a[] = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("enter elem : ");
			a[i] = ip.nextInt();
		}
		avgOfEvenElem(a);
	}

	public static void avgOfEvenElem(int a[]) {
		double c = 0;
		double evenSum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenSum = evenSum + a[i];
				c++;
			}
		}
		System.out.println(evenSum / c);
	}
}
