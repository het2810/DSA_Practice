package interview_prep.patterns;

import java.util.Scanner;

class p14_15_16{
	public void pattern14(int n) {
		for(int i=1 ; i<=n ;i++) {
			char c ='A';			
			for(int j=1 ;j<=i ;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
	public void pattern15(int n) {
		for(int i=n ; i>=0 ;i--) {
			char c = 'A';
			for(int j=1 ; j <=i ; j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
	public void pattern16(int n) {
		char c = 'A';
		for(int i =1 ; i<=n ;i++) {
			for(int j =1 ; j<=i ; j++) {
				System.out.print(c);//pattern 16
			}
			c++; // pattern 16
			System.out.println();
		}
	}
}

public class pattern14_15_16 extends p14_15_16{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		p14_15_16 p = new p14_15_16();
//		p.pattern14(num);
		p.pattern15(num);
//		p.pattern16(num);
	}
}
