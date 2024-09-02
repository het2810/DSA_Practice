package interview_prep.patterns;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("For loop called");
		for (int i =1 ; i<=n ; i++) {
			for(int j=1 ; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		
		}
	}
}
