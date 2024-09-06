package interview_prep.Binary_Search.Logic_Building;

public class SearchInRotatedArray {
	public int search(int nums[],int target) {
		int n= nums.length;
		int low =0;
		int high =n-1;		
		int ans =-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(nums[mid]==target) {
				ans = mid;
			}
			//check which portion is sorted
			if(nums[low]<=nums[mid]) {
				if(nums[low]<=target && target<=nums[mid]) {
					high = mid-1;
				}else {
					low = mid+1;
				}
			}else {
				if(nums[mid]<=target && target<=nums[high]) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		SearchInRotatedArray s = new SearchInRotatedArray();

		int nums[] ={4,5,6,7,0,1,2};
//		int nums[] ={1,2,3,4,5,6,7};
		int target = 99;
		System.out.println(s.search(nums, target));
		
		
		
	}
}	
