package interview_prep.Arrays.FAQs_Hard;

import java.util.ArrayList;
import java.util.List;

public class CountInversion {
	
	public int merge(int arr[],int low,int mid,int high) {
		List<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid+1;
		int count =0;
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				temp.add(arr[left]);
				left++;
				
			}else {
				temp.add(arr[right]);
				count += (mid-left+1);
				right++;
			}
		}
		while(left<=mid) {
			temp.add(arr[left]);
            left++;
		}
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
		return count;
	}
	
	
	public int mergeSort(int arr[],int low,int high) {
		int count =0;
		if(low<high) {
			int mid = (low+high)/2;
			System.out.println("low = "+low);
			System.out.println("mid = "+mid);
			System.out.println("high = "+high);
			 count += mergeSort(arr, low, mid);
			 count += mergeSort(arr, mid+1, high);
			 count += merge(arr, low, mid, high);
			 return count;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int nums[] ={9, 5, 4, 2};
		//Optimal Approach using Divide & Conqure (Merge Sort)
		CountInversion ci = new CountInversion();
		int c =ci.mergeSort(nums, 0, nums.length-1);
		System.out.println(c);
		
		//Brute Force Approach 
//		long n = nums.length;
//		long count =0;
//		for(long i=0;i<n-1;i++) {
//			for(long j=i+1;j<n;j++) {
//				if(nums[(int) i]>nums[(int)j]) {
//					count++;
//				}
//			}
//		}
//		System.out.println(count);
	}
}
