package interview_prep.Arrays.FAQs_Medium;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int nums1[] = {0, 2, 7, 8,0,0,0};
		int nums2[] = {-7, -3, -1};
		int m =4;
		int n = 3;
		int j=0;
		for(int i=m;i<m+n;i++) {
			nums1[i] = nums2[j];
			j++;
		}
		Arrays.sort(nums1);
		for(int i=0;i<nums1.length;i++) {
			System.out.print(nums1[i]+" ");
		}
	}
}
