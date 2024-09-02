package interview_prep.Arrays.FAQs_Medium;

import java.util.*;

public class ThreeSums {
	public static void main(String[] args) {
		int nums[] = { 2, -2, 0, 3, -3, 5 };
		int n = nums.length;
		//Optimal Approach
		
		Arrays.sort(nums);
		List<List<Integer>> triplets = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			int j=i+1;
			int k=n-1;
			while(j<k) {
				int sum = nums[i]+nums[j]+nums[k];
				
				if(sum<0) {
					j++;
				}else if(sum>0){
					k++;
				}else{
					List<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[k]);
					
					triplets.add(temp);
					j++;
					k--;
					while(j<k && nums[j]==nums[j-1]) j++; 
					while(j<k && nums[k]==nums[k+1]) k--; 
				}
			}
		}
		
		
		
		
		

		//BetterApproach--TLE
		
//		Set<List<Integer>> triplets = new HashSet<>();
//		for (int i = 0; i < n - 2; i++) {
//			Set<Integer> elements = new HashSet<>();
//			for (int j = i + 1; j < n; j++) {
//				int third = -(nums[i] + nums[j]);
//				if (elements.contains(third)) {
//					List<Integer> temp = new ArrayList<>();
//					temp.add(nums[i]);
//					temp.add(nums[j]);
//					temp.add(third);
//
//					Collections.sort(temp);
//					triplets.add(temp);
//				}
//				elements.add(nums[j]);
//			}
//		}
//
//		List<List<Integer>> ans = new ArrayList<>(triplets);
//		for (List<Integer> triplet : ans) {
//			System.out.println(triplet);
//		}
		// Brute force approach---TLE
//		for(int i=0;i<n-2;i++) {
//			for(int j=i+1;j<n-1;j++) {
//				for(int k=j+1;k<n;k++) {
//					if(nums[i]+nums[j]+nums[k] == 0) {
//						System.out.println(nums[i]+","+nums[j]+","+nums[k]);
//						System.out.println();
//					}
//				}
//			}
//		}
	}
}
