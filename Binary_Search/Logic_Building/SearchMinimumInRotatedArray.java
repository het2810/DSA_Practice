package interview_prep.Binary_Search.Logic_Building;

import java.util.ArrayList;
import java.util.List;

public class SearchMinimumInRotatedArray {
	public int searchMinimun(ArrayList<Integer> arr) {
//		Collections.sort(arr);
//		return arr.get(0);
		int n= arr.size();
		int low = 0;
		int high = n-1;
		int ans = Integer.MAX_VALUE;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr.get(low)<= arr.get(mid)) {
				ans = Math.min(ans, arr.get(low));
				low = mid+1;
			}else {
				ans = Math.min(ans, arr.get(mid));
				high = mid-1;
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		SearchMinimumInRotatedArray sm = new SearchMinimumInRotatedArray();
		int nums1[]= {7,8,1,2,3,4,5,6};
		List<Integer> nums = new ArrayList<>();
		for(int i=0;i<nums1.length;i++) {
			nums.add(nums1[i]);
		}
		System.out.println(sm.searchMinimun((ArrayList<Integer>) nums));
	}
}
