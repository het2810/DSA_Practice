package interview_prep.Binary_Search.Logic_Building;

import java.util.ArrayList;
import java.util.List;

public class FindRotation {
	public int findkRotation(ArrayList<Integer> nums) {
		int n = nums.size();
		int low =0;
		int high = n-1;
		int ans = Integer.MAX_VALUE;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums.get(low)<=nums.get(mid)) {
				ans = Math.min(ans, nums.get(low));
				System.out.println("Ans-1 : "+ans);
				low = mid+1;
			}else {
				ans = Math.min(ans, nums.get(mid));
				System.out.println("Ans-2 : "+ans);
				high = mid-1;
			}
			
		}
		
		return nums.indexOf(ans);
	}
	
	public static void main(String[] args) {
		int nums1[]= {4, 5, 6, 7, 0, 1, 2, 3};
		List<Integer> nums = new ArrayList<>();
		for(int i=0;i<nums1.length;i++) {
			nums.add(nums1[i]);
		}
		FindRotation f = new FindRotation();
		System.out.println(f.findkRotation((ArrayList<Integer>) nums));
	}
}
