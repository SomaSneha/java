/* WAP to print the duplicate elements from an array */

public class Duplicate {
	public static void main(String[] args) {
		int i, j;
		int x[] = { 2, 5, 3, 2, 7, 3 };
		for (i = 0; i < x.length; i++) {
			for (j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.out.println(x[i]);
				}
			}
		}
	}
}
