package interview_prep.Binary_Search.Logic_Building;

import java.util.ArrayList;
import java.util.List;

public class SearchInRotatedArray2 {
	
	public boolean search(ArrayList<Integer> nums,int target) {
		
//		if(nums.contains(target)) {
//			return true;
//		}
//		return false;
		
		
		int n= nums.size();
		int low =0;
		int high =n-1;		
		boolean isPresent = false;
		while(low<=high) {
			int mid=(low+high)/2;
			if(nums.get(mid)==target) {
				isPresent = true;
			}
			if(nums.get(low) == nums.get(mid) && nums.get(mid) == nums.get(high)) {
				low++;
				high--;
				continue;
			}
			//check which portion is sorted
			if(nums.get(low)<=nums.get(mid)) {
				if(nums.get(low)<=target && target<=nums.get(mid)) {
					high = mid-1;
				}else {
					low = mid+1;
				}
			}else {
				if(nums.get(mid)<=target && target<=nums.get(high)) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}
		}
		return isPresent;
	}
	
	public static void main(String[] args) {
//		int nums1[]= {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
		int nums1[]= {3,3,3,1,2,3,3,3,3};
		List<Integer> nums = new ArrayList<>();
		for(int i=0;i<nums1.length;i++) {
			nums.add(nums1[i]);
		}
		int target=0;
		SearchInRotatedArray2 s2 = new SearchInRotatedArray2();
		System.out.println(s2.search((ArrayList<Integer>) nums, target));
	}
}
