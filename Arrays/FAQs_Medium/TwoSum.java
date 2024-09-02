package interview_prep.Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	public static void main(String[] args) {
		//Better Approach
//		  int[] indices = new int[2];
//	        Map<Integer, Integer> map = new HashMap<>(); 
//	        for (int i = 0; i < nums.length; i++) {
//	            int complement = target - nums[i];
//	            if (map.containsKey(complement)) {
//	                indices[0] = map.get(complement);
//	                indices[1] = i;
//	                return indices;
//	            }
//	            map.put(nums[i], i);
//	        }
//	        return indices;
		int nums[] = {1, 3, 5, -7, 6, -3};
		int target =0;
		int n= nums.length;
		int ans[] = new int[2];
		List<Integer> temp = new ArrayList<>();
		for(int i =0;i<n;i++) {
			temp.add(nums[i]);
		}
		for(int i=0;i<n;i++) {
			int complement = target-temp.get(i);
			if(temp.contains(complement)) {
				int ind = temp.indexOf(complement);
				System.out.println(ind);
				break;
			}
		}
	}
}
