package interview_prep.Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
	public static void main(String[] args) {
//		int nums[]= {2, 4, 5, -1, -3, -4};
//		int n= nums.length;
		
		//Brute Force
		
//		List<Integer> pos = new ArrayList<>();
//		List<Integer> neg = new ArrayList<>();
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]>0 ) {
//				pos.add(nums[i]);
//			}else {
//				neg.add(nums[i]);
//			}
//			
//		}
//		int ans[] = new int[pos.size()+neg.size()];
//		System.out.println(".....");
//		for (int i = 0; i < n; i++) {
//            if (nums[i] > 0) pos.add(nums[i]);
//            else neg.add(nums[i]);
//        }
//		// Positives on even indices, negatives on odd.
//        for (int i = 0; i < n / 2; i++) {
//            ans[2 * i] = pos.get(i);
//            ans[2 * i + 1] = neg.get(i);
//        }
//		System.out.print("Postive numbers : ");
//		for(int i=0;i<pos.size();i++) {
//			System.out.print(pos.get(i)+" ");
//		}
//		System.out.print("\nNegative numbers : ");
//		for(int i=0;i<neg.size();i++) {
//			System.out.print(neg.get(i)+" ");
//		}
//		System.out.print("\nRe-Arranged Array : ");
//		for(int i=0;i<nums.length;i++) {
//			System.out.print(ans[i]+" ");
//		}
		
		
//		Optimal 
		
		int nums[]= {2, 4, 5, -1, -3, -4};
		int n= nums.length;
		int pos=0;
		int neg=1;
		
		int ans[] = new int[n];
		for(int i=0;i<n;i++) {
			if(nums[i]>0) {
				ans[pos] = nums[i];
				pos+=2;
			}else {
				ans[neg] = nums[i];
				neg+=2;
			}
		}
		System.out.print("Answer: ");
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
