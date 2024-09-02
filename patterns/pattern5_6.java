package interview_prep.patterns;

import java.util.Scanner;

public class pattern5_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n ; i >=0 ; i--) {
			for(int j = 1 ; j<=i ; j++) {
//				System.out.print("*"); // for pattern 5
				System.out.print(j); // for pattern 6
			}
			System.out.println();
		}
	}
}
