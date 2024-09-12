package interview_prep.Binary_Search.FAQs;

public class SplitArray {
	
	public int countPartation(int nums[],int sum) {
		int count =1,sumSubArray =0;
		for(int i=0;i<nums.length;i++) {
			if(sumSubArray+nums[i]<=sum) {
				sumSubArray += nums[i];
			}else {
				count++;
				sumSubArray=nums[i];
			}
		}
		return count;
	}
//	Binary Search
	public int largestSubarraySumMinimized(int[] a, int k) {
		SplitArray s = new SplitArray();
		int n = a.length;
		if(n==0) return -1;
		int low = Integer.MIN_VALUE;//max element of array
		int high =0;//sum of array
		for(int i=0;i<a.length;i++) {
			low = Math.max(low, a[i]);
			high += a[i];  
		}
		while(low<=high) {
			int mid=(low+high)/2;
			int countSum = s.countPartation(a, mid);
			if(countSum>k) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			
		}
		return low;
		
	}
	
	
	//Linear Search Approach
//	public int largestSubarraySumMinimized(int[] a, int k) {
//		SplitArray s = new SplitArray();
//		int n = a.length;
//		if(n==0) return -1;
//		int low = Integer.MIN_VALUE;//max element of array
//		int high =0;//sum of array
//		
//		for(int i=0;i<a.length;i++) {
//			low = Math.max(low, a[i]);
//			high += a[i];  
//		}
//		for(int i=low;i<=high;i++) {
//			int countSum = s.countPartation(a, i);
//			if(countSum==k) {
//				return i;
//			}
//		}
//		
//		return low;
//    }
	
	public static void main(String[] args) {
		int nums[]= {1, 2, 3, 4, 5};
		int k=3;
		SplitArray sa = new SplitArray();
		System.out.println(sa.largestSubarraySumMinimized(nums, k));
	}
}
