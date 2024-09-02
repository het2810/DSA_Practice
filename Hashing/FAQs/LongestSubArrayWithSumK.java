package interview_prep.Hashing.FAQs;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
	
	public int longestSubArray(int nums[],int k) {
		int n = nums.length;
		if(n==0) return 0;
		Map<Long, Long> map = new HashMap<>();
		long prefixSum=0;
		long longest =0;	
		for(long i=0;i<n;i++) {
			prefixSum += nums[(int) i];
			if(prefixSum ==k) {
				longest = Math.max(longest, i+1);
			}
			if(map.containsKey(prefixSum-k)) {
				int len = (int) (i - map.get(prefixSum-k));
				longest = Math.max(longest, len);
			}
			
			if(!map.containsKey(prefixSum)) {
				map.put(prefixSum, i);
			}
		}
		
		return (int) longest;
	}
	
	
	public static void main(String[] args) {
		int nums[] = {10, 5, 2, 7, 1, 9};
		LongestSubArrayWithSumK l = new LongestSubArrayWithSumK();
		System.out.println(l.longestSubArray(nums, 15));
		
	}
}
