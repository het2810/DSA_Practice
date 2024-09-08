package interview_prep.Binary_Search.On_Answers;

import java.util.Arrays;

public class SmallestDivisor {
	
	public int smallestDivisor(int nums[],int limit) {//		
		
		//Binary Search Approach
		int n = nums.length;
		Arrays.sort(nums);
		int max=nums[n-1];
		int low = 1;
		int high =max;
		while(low<=high) {
			int mid=(low+high)/2;
			int sum =0;
			for(int i=0;i<n;i++) {
				sum += Math.ceilDiv(nums[i], mid);
			}
			if(sum<=limit) {
				high = mid-1;
			}else{
				low =mid+1;
			}
			
		}
		
		
		return low;
		
		
		
//		Brute force Approach
//		Arrays.sort(nums);
//		int n = nums.length;
//		int max = nums[n-1];
//		int ans = Integer.MAX_VALUE;
//		for(int i=1;i<=max;i++) {
//			int sum =0;
//			for(int j=0;j<n;j++) {
//				sum += Math.ceilDiv(nums[j], i);
//			}
////			System.out.println(i+"-"+"Sum = "+sum);
//			if(sum<=limit) {
//				ans=Math.min(ans, i);
////				System.out.println("ans ="+ans);
//			}
//		}
//		return ans;
	}
	
	public static void main(String[] args) {
		int nums[]= {3, 7, 6, 11};
		int limit=8;
//		System.out.println(Math.ceilDiv(8, 3));
		SmallestDivisor s = new SmallestDivisor();
		System.out.println(s.smallestDivisor(nums, limit));
	}
}
