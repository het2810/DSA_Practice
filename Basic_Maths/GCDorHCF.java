package interview_prep.Basic_Maths;

import java.util.Scanner;

public class GCDorHCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hcf=0,a = sc.nextInt(), b = sc.nextInt(), min = Math.min(a, b),max = Math.max(a, b);
		if(max%min ==0) {
			System.out.println(min+ " is a HCF of "+a+" & "+b);
		}else {
			for(int i=1;i<=min;i++) {
				if(max%i==0 && min%i==0) {
					hcf=i;
				}
			}
			System.out.println(hcf+" is a HCF of "+a+" & "+b);
		}

	}
}
