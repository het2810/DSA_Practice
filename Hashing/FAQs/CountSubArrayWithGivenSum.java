package interview_prep.Hashing.FAQs;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithGivenSum {
	
	public int countSubArray(int nums[],int k) {
		int n = nums.length;
		if(n==0) return 0;
		Map<Integer, Integer> map = new HashMap<>();
		int prefixSum =0;
		int count =0;
		map.put(0, 1);
		for(int i=0;i<n;i++) {
			prefixSum += nums[i];
			int sumToRemove = prefixSum -k;
			
			count += map.getOrDefault(sumToRemove, 0);
			
			map.put(prefixSum,map.getOrDefault(prefixSum, 0)+1);
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		int nums[]= {1, 1, 1};
		CountSubArrayWithGivenSum c = new CountSubArrayWithGivenSum();
		System.out.println(c.countSubArray(nums, 2));
		
	}
}
