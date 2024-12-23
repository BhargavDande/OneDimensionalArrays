/*output : 
[1, 2, 3, 20, 13, 65]
1, 2, 3, 20, 13, 65,                     */

package arraysOneD;

import java.util.Arrays;

public class P11SampleArrayProblem {
	public static void main(String[] args) {
		int b = 20;
		int a[] = { 1, 2, 1 + 2, b, 015, 'A' };
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}
}
