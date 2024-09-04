package interview_prep.Binary_Search.Fundamentals;

public class SearchXInSortedArray {
	public int search(int nums[],int target,int low,int high) {
		int mid = (low+high)/2;
		if(nums[mid]==target) {
			return mid;
		}else if (nums[mid]<target) {
			low = mid+1;
			search(nums, target, low, high);
		}else {
			high = mid-1;
			search(nums, target, low, high);
		}
		return -1;
	}
	
	public int searchXRecursion(int nums[],int target) {
		int n = nums.length;
		int low =0;
		int high = n-1;
		return search(nums, target, low, high);
	}
	
	public int searchX(int nums[],int target) {
		int n = nums.length;
		int low  = 0;
		int high = n-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]== target) {
				return mid;
			}else if(nums[mid]<target){
				low = mid+1;
			}else {
				high = mid-1;
			}
			
		}
		
		return -1;
	}
	
//	public int searchX(int nums[],int target) {
//		int n = nums.length;
//		int mid = n/2;
//		if(target<nums[mid]) {
//			for(int i=0;i<mid;i++) {
//				if(nums[i]==target) {
//					return i;
//				}
//			}	
//		}
//		
//		if(target>=nums[mid]) {
//			for(int i=mid;i<n;i++) {
//				if(nums[i]==target) {
//					return i;
//				}
//			}
//		}
//		return -1;
//	}
//	
	public static void main(String[] args) {
		SearchXInSortedArray s = new SearchXInSortedArray();
		int nums[] = {-1,0,3,5,9,12};
		int target =12;
		System.out.println(s.searchX(nums, target));
		
	}
}
