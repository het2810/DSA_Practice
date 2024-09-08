package interview_prep.Binary_Search.On_Answers;

import java.util.Arrays;

public class KokoEatingBananas {
	
	public int minimumRateToEatBananas(int nums[],int h) {
		int n= nums.length;
		Arrays.sort(nums);
		int low =1;
		int high = nums[n-1];
		
		while(low<=high) {
			int mid=(low+high)/2;
			int sum =0;
			for(int i=0;i<n;i++) {
				sum += Math.ceilDiv(nums[i], mid);
			}
			if(sum<=h) {
				high = mid-1;
			}else{
				low =mid+1;
			}
		}
		
		return low;
	}
	
	
	
	public static void main(String[] args) {
		int nums[]= {7, 15, 6, 3};
		int hours = 8;
		KokoEatingBananas k = new KokoEatingBananas();
		System.out.println(k.minimumRateToEatBananas(nums, hours));
	}
}
