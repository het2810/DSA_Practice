package interview_prep.Binary_Search.FAQs;

import java.util.Arrays;

public class AggresiveCows {
	
	public boolean canWePlace(int nums[],int i,int k) {
		int n = nums.length;
		int countCow =1;
		int last =nums[0];
		for(int j=1;j<=n-1;j++) {
			if(nums[j]-last >= i) {
				countCow++;
				last = nums[j];
			}
			if(countCow>=k) return true;
		}
		return false;
	}
	
	//Binary Search
	public int aggressiveCows(int[] nums, int k) {
		AggresiveCows c = new AggresiveCows();
		Arrays.sort(nums);
		int n = nums.length;
		int low = 1;
		int high = nums[n-1]-nums[0];
		while(low<=high) {
			int mid =(low+high)/2;
			if(!c.canWePlace(nums, mid, k)) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return high;
	} 
	
	
	//Linear Search
//	public int aggressiveCows(int[] nums, int k) {
//		AggresiveCows c = new AggresiveCows();
//		Arrays.sort(nums);
//		int min = nums[0];
//		int max = nums[nums.length-1];
//		for(int i=0;i<max-min;i++) {
//			if(!c.canWePlace(nums, i, k)) {
//				return i-1;
//			}
//		}
//		
//		return max-min;
//	} 
	
	
	public static void main(String[] args) {
		int stalls[] = {0, 3, 4, 7, 10, 9};
		int k=4; // aggresive cows
		AggresiveCows c = new AggresiveCows();
		System.out.println(c.aggressiveCows(stalls, k));
		
	}
}
