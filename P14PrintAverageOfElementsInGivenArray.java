package arraysOneD;

import java.util.Scanner;

public class P14PrintAverageOfElementsInGivenArray {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int sz = ip.nextInt();
		int a[] = new int[sz];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter elem at " + i + " th index : ");
			a[i] = ip.nextInt();
		}
		double res = averageOfArrayElem(a);
		System.out.println("Average of Array elements is : " + res);
	}

	public static double averageOfArrayElem(int a[]) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum / a.length;
	}
}
