package interview_prep.Arrays.FAQs_Hard;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {
	public static void main(String[] args) {
		int nums[] = {1, 1, 1, 2, 1, 2};
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer> itt : map.entrySet()) {
			int key = itt.getKey();
			int value = itt.getValue();
			if(value>n/2) {
				System.out.println(key);
			}
		}
	}
}
