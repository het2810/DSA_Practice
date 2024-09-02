package interview_prep.patterns;

import java.util.Scanner;

public class pattern18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch = 'E';
		for(int i=0 ; i<n;i++) {
			for(char c =(char) ('E' - i);c<='E';c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
