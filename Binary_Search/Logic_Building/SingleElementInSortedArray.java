package interview_prep.Binary_Search.Logic_Building;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray {

	public int singleElement(int []nums) {
//		Optimal
		int n = nums.length;
		int low =1;
		int high = n-2;
		if(n==1) return nums[0];
		if(nums[n-1] != nums[n-2]) return nums[n-1];
		
		while(low<=high) {
			int mid =(low+high)/2;
			if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) {
				return nums[mid];
			}
			//left half & element on right half hence eleminate left part
			if((mid%2 ==1 && nums[mid-1]==nums[mid]) || (mid%2==0 && nums[mid]==nums[mid+1])) {
				low=mid+1;
			}else {
				high = mid-1; //right half eleminated
			}
		}
		
		return -1;
		
		//Brute Force
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0;i<nums.length;i++) {
//			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//		}
//		int ans =0;
//		for(Map.Entry<Integer, Integer>itt : map.entrySet()) {
//			if(itt.getValue()==1) {
//				ans = itt.getKey();
//			}
//		}
//		return ans;
	}
	
	public static void main(String[] args) {
		int nums[]= {1, 1, 2, 2, 3, 3, 4,4, 5, 5, 6, 6,7};
		SingleElementInSortedArray s = new SingleElementInSortedArray();
		System.out.println(s.singleElement(nums));
	}
}
