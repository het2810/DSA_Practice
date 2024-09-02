package interview_prep.Arrays.FAQs_Hard;

import java.util.ArrayList;
import java.util.List;

import interview_prep.Sorting.MergeSort;

public class ReversePairs {
	
	public void merge(int arr[],int low,int mid,int high) {
		int left = low;
		int right = mid+1;
		List<Integer> temp = new ArrayList<>();
		
		while(left<=mid && right<=high) {
			if(arr[left]<arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
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
		
		for(int i=low;i<=high;i++) {
			arr[i] = temp.get(i-low);
		}
		
	}
	
	public int countPair(int arr[],int low,int mid,int high) {
		int count =0;
		int right = mid+1;
		for(int i=low;i<=mid;i++) {
			while(right<=high && arr[i]>2*arr[right]) right++;
			count += (right -(mid+1));
		}
		return count;
	}
	
	public int mergeSort(int arr[],int low,int high) {
		int count =0;
		if(low>=high) {
			return count;
		}
		int mid = low+(high-low)/2;
		
		count += mergeSort(arr, low, mid);
		count += mergeSort(arr, mid+1, high);
		count += countPair(arr, low, mid, high);
		merge(arr, low, mid, high);
		
		return count;
	}
	
	
	public static void main(String[] args) {
		//Optimal
		int nums[] = {6, 4, 1,2,7};
		
	ReversePairs rp = new ReversePairs();
	int ans = rp.mergeSort(nums, 0, nums.length-1);
	System.out.println(ans);
		//Brute Force Apporach
//		int nums[] = {6, 4, 4, 2, 2};
//		int n = nums.length;
//		int count=0;
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(nums[i]>2*nums[j]) {
//					count++;
//				}
//			}
//		}
//		System.out.println(count);
	}
}
