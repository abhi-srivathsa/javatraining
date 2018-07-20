package pattern;

import java.util.Scanner;

public class JavaProgram {
	public static void main(String args[]) {

		int i, space, rows, k = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		rows = scan.nextInt();
		for (i = 1; i <= rows; i++) {
			for (space = 1; space <= (rows - i); space++) {
				System.out.print("  ");
			}
			if (i <= rows / 2) {
				for (int j = 0; j < i; j++) {
					System.out.print("*  ");

				}
			} else {
				while (k != i) {
					System.out.print("*  ");
					k++;
				}
				System.out.print("*  ");
				k = 0;
			}
			System.out.println();
		}
	}
}