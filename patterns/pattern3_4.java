package interview_prep.patterns;

import java.util.Scanner;

public class pattern3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n ;i++) {
			for(int j=1 ;j<=i; j++) {
				System.out.print(j);// for pattern 3
//				System.out.print(i);// for pattern 4
			}
			System.out.println("\n");
		}
	}
	
}
