package interview_prep.Arrays.FAQs_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatingAndMissingElement {
	public static void main(String[] args) {
		//Optimal
		int nums[]= {6, 5, 7, 1, 8, 6, 4, 3, 2};
		int n = nums.length;
		
		long sn = (n*(n+1))/2;
		long s2n = (n*(n+1)*(2*n+1))/6;
		System.out.println("sn = "+sn);
		System.out.println("s2n= "+s2n);
		long s=0;
		long s2 =0;
		for(int i=0;i<n;i++) {
			s += nums[i];
			s2 += (nums[i]*nums[i]);
		}
		System.out.println("x-y or s-sn = "+(s-sn));
		System.out.println("s2-s2n = "+(s2-s2n));
		long x; // repeating element
		long y;	// Missing element
		long temp = ((s2-s2n)/(s-sn));
		System.out.println("x+y ="+temp);
		long temp2 = ((s-sn)+(temp));
		x =(temp2/2);
		System.out.println("x="+x);
		y = (temp -x);
		System.out.println("y="+y);
		int ans[] = new int[2];
		ans[0] = (int)x;
		ans[1] = (int)y;
		/*
		 * 
		 * 
		 * */
		
		//BruteForce
//		Arrays.sort(nums);
//		List<Integer> temp = new ArrayList<>();
//		for(int i=0;i<n;i++) {
//			temp.add(nums[i]);
//		}
//		for(int i=0;i<temp.size();i++) {
//			System.out.print(temp.get(i)+" ");
//		}
//		for(int i=1;i<=n;i++) {
//			if(!temp.contains(i)) {
//				ans[1] = i;
//			}
//		}
//		for(int i=1;i<n;i++) {
//			if(temp.get(i-1)==temp.get(i)) {
//				ans[0] = temp.get(i);
//			}
//		}
//		System.out.println("\nans[0] = "+ans[0]);
//		System.out.println("ans[1] = "+ans[1]);
	}
}
