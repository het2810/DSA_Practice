package interview_prep.Arrays.FAQs_Medium;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInAnArray {
	public static void main(String[] args) {
		int nums[]= {-3, 4, 5, 1, -4, -5};
		int n = nums.length;
		List<Integer> ans = new ArrayList<>();
		
		//Brute Force Approach
		/*
		for(int i=0;i<n;i++) {
			boolean isLeader = true;
			for(int j=i+1;j<n;j++) {
				if(nums[j]>nums[i]) {
					isLeader = false;
					break;
				}
			}
			if(isLeader == true) {
				ans.add(nums[i]);
			}
		}
		*/
		
		//Optimal Approach
		int max = nums[n-1];
		ans.add(max);
		for(int i=n-2;i>=0;i--) {
//			System.out.println(".........");
			if(nums[i]>max) {
				ans.add(nums[i]);
				max=nums[i];
			}
		}
		
		System.out.print("Before Reversing : ");
		for(int i =0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
		Collections.reverse(ans);
		System.out.print("\nAfter Reversing : ");
		for(int i =0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}
}

