package interview_prep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int nums1[]= {1, 2,2,2, 2, 3, 5};
		int nums2[]= {1, 2,3, 7};
		int n1 = nums1.length;
		int n2 = nums2.length;
		List<Integer> temp = new ArrayList<>();
		int i =0;
		int j=0;
		
		while(i<n1 && j<n2) {
			if(nums1[i]<nums2[j]) {
				i++;
			}else if(nums1[i]>nums2[j]) {
				j++;
			}else {
				temp.add(nums1[i]);
				i++;
				j++;
			}
		}
		
		
		System.out.print("List : ");
		for(int t=0;t<temp.size();t++) {
			System.out.print(temp.get(t)+" ");
		}
	}
}
