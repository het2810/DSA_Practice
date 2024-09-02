package interview_prep.Hashing.FAQs;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithXOR {
	public int countSubArray(int arr[],int k) {
		int n = arr.length;
		int xr =0;
		Map<Integer, Integer> map = new HashMap<>();
		int count =0;
		map.put(xr, map.getOrDefault(xr, 0)+1);
		for(int i=0;i<n;i++) {
			xr = xr ^ arr[i];
			int x = xr ^ k;
			count += map.getOrDefault(x, 0);
			map.put(xr, map.getOrDefault(xr, 0)+1);
			
		}
		
		
		return count;
	}
	public static void main(String[] args) {
		CountSubArrayWithXOR c = new CountSubArrayWithXOR();
		int nums[] = {4, 2, 2, 6, 4};
		System.out.println(c.countSubArray(nums, 6));
	}
}
