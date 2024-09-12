package interview_prep.Binary_Search.FAQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoArrays {
	
	public double median(int[] arr1, int[] arr2) {
	     List<Integer> temp = new ArrayList<>();
	     double ans =0;
	     for(int i=0;i<arr1.length;i++) {
	    	 temp.add(arr1[i]);
	     }
	     for(int i=0;i<arr2.length;i++) {
	    	 temp.add(arr2[i]);
	     }
	     Collections.sort(temp);
	     if(temp.size()%2==0) {
	    	 int a = temp.size()/2;
	    	 ans = (((double)temp.get(a)+(double)temp.get(a-1))/2);
	     }else {
	    	 ans = (double)temp.get(temp.size()/2);
	     }
	     return ans;
    }
	
	public static void main(String[] args) {
		int arr1[]= {2, 4, 6};
		int arr2[]= {1,3,5,7};
		MedianOfTwoArrays m = new MedianOfTwoArrays();
		System.out.println(m.median(arr1, arr2));
		
	}
}
