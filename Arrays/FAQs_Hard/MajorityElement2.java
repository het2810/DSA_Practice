package interview_prep.Arrays.FAQs_Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
	public static void main(String[] args) {
		int nums[]= {1, 2, 1, 1, 3, 2, 2, 3};
		List<Integer> ans = new ArrayList<>();
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer>it : map.entrySet()) {
			System.out.print("key : "+it.getKey()+" ,value = "+it.getValue());
			System.out.println();
			if(it.getValue()>(n/3)) {
				ans.add(it.getKey());
			}
		}
		System.out.print("List : ");
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}
}
