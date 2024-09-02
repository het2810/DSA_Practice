package interview_prep.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {
	public static void main(String[] args) {
		int nums[] = { -2, 2, 4, 4, 4, 4, 5, 5 };
		int n = nums.length;
		//Brute Force
//		Set<Integer> temp = new HashSet<>();
//		for (int i = 0; i < n; i++) {
//			temp.add(nums[i]);
//		}
//		Object setarr[] = temp.toArray();
//		System.out.print("Set : ");
//		for (int i = 0; i < temp.size(); i++) {
//			System.out.print(setarr[i] + " ");
//		}
//		for (int i = 0; i < n; i++) {
//			if (i < temp.size()) {
//				nums[i] = (int) (setarr[i]);
//			}
//		}
//		System.out.print("\nArray :");

		// Another Approach Optimal
		
		int i =0;
		for(int j = 1;j<n;j++) {
			if(nums[j] != nums[i]) {
				nums[i+1] = nums[j];
				i++;
			}
		}
		for(int k=0;k<n;k++) {
			System.out.print(nums[k] + " ");
		}
		
	}
}
