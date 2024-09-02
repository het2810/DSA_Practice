package interview_prep.patterns;

import java.util.Scanner;


class Upperside{
	public void upper(int n) {
		int iniS =0;
		for(int i=0;i<n;i++) {
			for(int j = 1 ;j <=n-i;j++) {
				System.out.print("*");
			}
			for(int j = 0 ; j<iniS ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ;j <=n-i;j++) {
				System.out.print("*");
			}
			iniS += 2;
			System.out.println();
		}
	}
}
class Lowerside {
	public void lower(int n) {
		int space = 2*(n-1);
		for(int i=1 ; i<= n ; i++) {
			for(int j =1 ; j<=i ; j++) {
				System.out.print("*");
			}
			for(int j=1 ; j<=space ; j++) {
				System.out.print(" ");
			}
			for(int j =i ;j>=1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
			space -= 2;
		}
	}
}
public class pattern19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Upperside up = new Upperside();
		Lowerside low = new Lowerside();
		up.upper(n);
		low.lower(n);
		
	}
}
