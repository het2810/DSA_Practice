package interview_prep.Basic_Maths;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ((n * n) < 24) {

			if (n == 4 || n == 1) {
				System.out.println(n + " is not a prime number");
			} else {
				System.out.println(n + " is a Prime number");
			}

		} else if (((n * n) - 1) % 24 == 0) {
			System.out.println(n + " is a Prime number");

		} else {
			System.out.println(n + " is not a Prime number");
		}

	}
}
