package interview_prep.Hashing.FAQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int nums[] = {100, 4, 200, 1, 3, 2};
		//Optimal Approach
		if(nums.length==0) {
			System.out.println("0");
		}
		Set<Integer> temp = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			temp.add(nums[i]);
		}
		System.out.println(temp.size());
		int longest =1;
		for(int itt :temp) {
			if(!temp.contains(itt-1)) {
				int count =1;
				int x = itt;
				
				while(temp.contains(x+1)) {
					x++;
					count++;
				}
				longest = Math.max(longest, count);
			}
		}
		System.out.println(longest);
		
		
		
		
		
		
		
		
		//Better Approach -->nlong(n)
//		Arrays.sort(nums);
//		int longest =1;
//		int count =0;
//		int minElement = Integer.MIN_VALUE;
//		
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]-1 == minElement) {
//				count++;
//				minElement = nums[i];
//			}else if(nums[i] != minElement) {
//				count =1;
//				minElement = nums[i];
//			}
//			longest= Math.max(longest, count);
//		}
//		System.out.println(longest);
//		
//		
//		
		
		
		
		
		
		//Brute Force Approach
//		Arrays.sort(nums);
//		List<Integer> temp = new ArrayList<>();
//		for(int i=0;i<nums.length;i++) {
//			temp.add(nums[i]);
//		}
//		for(int it:temp) {
//			System.out.print(it+" ");
//		}
//		int min = temp.get(0);
//		int count=1;
//		int ans=1;
//		for(int i=1;i<temp.size();i++) {
//			if(temp.contains(min+1)) {
//				count++;
//				min = min+1;
//			}else {
//				min = temp.get(i);
////				ans = Math.max(ans, count);
//				count =1;
//			}
//			System.out.println("\nMin = "+min);
//		}
//		System.out.println("\nCOunt ="+count);
//		System.out.println("Ans ="+ans);
	}
}
