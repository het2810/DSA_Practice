package interview_prep.patterns;

import java.util.Scanner;

public class pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n;i++) {
				for(int k =0 ; k < n-i-1  ; k++) {
					System.out.print(" ");
				}
				for(int k = 0 ; k< 2*i+1 ; k++) {
					System.out.print("*");
				}
				for(int k =0 ; k < n-i-1  ; k++) {
					System.out.print(" ");
				}
				System.out.println();
		}
	}
}
