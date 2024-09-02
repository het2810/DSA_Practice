package interview_prep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoArrays {
	public static void main(String[] args) {
		int nums1[]= {3, 4, 6, 7, 9, 9};
		int nums2[]= {1, 5, 7, 8, 8};
//		Brute Force
//		Set<Integer> ans = new HashSet<>();
//		for(int i=0;i<nums1.length;i++) {
//			ans.add(nums1[i]);
//		}
//		for(int i=0;i<nums2.length;i++) {
//			ans.add(nums2[i]);
//		}
//		
//		Object[] temp = ans.toArray();
//		System.out.print("\nSet : ");
//		for(int i=0;i<ans.size();i++) {
//			System.out.print(temp[i]+" ");
//		}
//		Optimal (2 pointer)
//		int nums1[]= {3, 4, 6, 7, 9, 9};
//		int nums2[]= {1, 5, 7, 8, 8};
		//1 3 4 
		List<Integer> temp = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(i<nums1.length && j<nums2.length) {

			if(nums1[i] >= nums2[j]) {
				if(temp.contains(nums2[j])) {
					j++;
				}else {
					temp.add(nums2[j]);
					System.out.println("If Condition : "+nums2[j]);
					System.out.println("J = "+j);
					j++;
				}
			}else {
				if(temp.contains(nums1[i])) {
					i++;
				}else {
					temp.add(nums1[i]);
					System.out.println("else Condition : "+nums1[i]);
					System.out.println("i = "+i);
					i++;
				}
			}
		}
		while(j<nums2.length) {
			if(temp.contains(nums2[j])) {
				j++;
			}else {
				temp.add(nums2[j]);
				System.out.println("If Condition : "+nums2[j]);
				System.out.println("J = "+j);
				j++;
			}
		}
		while(i<nums1.length) {
			if(temp.contains(nums1[i])) {
				i++;
			}else {
				temp.add(nums1[i]);
				System.out.println("else Condition : "+nums1[i]);
				System.out.println("i = "+i);
				i++;
			}
		}
		System.out.println("J = "+j);
		System.out.println("i = "+i);
		System.out.println("Printing");
		for(int t=0;t<temp.size();t++) {
			System.out.print(temp.get(t)+" ");
		}
	}
}
