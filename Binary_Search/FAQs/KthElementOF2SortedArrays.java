package interview_prep.Binary_Search.FAQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthElementOF2SortedArrays {
	

	public int kthElement(int[] a, int[] b, int k) {
		int n= a.length;
		int n1 = b.length;
		
		List<Integer> temp = new ArrayList<>();
		for(int i=0;i<n;i++) {
			temp.add(a[i]);
		}
		for(int i=0;i<n1;i++) {
			temp.add(b[i]);
		}
		Collections.sort(temp);
		
		
		return temp.get(k-1);
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 6};
		int b[] = { 7, 9};
		int k = 4;
		KthElementOF2SortedArrays kth = new KthElementOF2SortedArrays();
		System.out.println(kth.kthElement(a, b, k));
	}
}
