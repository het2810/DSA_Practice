package interview_prep.Binary_Search.Logic_Building;

public class SearchInRotatedArray {
	public int search(int nums[],int target) {
		int n= nums.length;
		int i=0;
		int j=n-1;
		int low = 0;
		int high =0;
		while(i<=j) {
			if(nums[i]<nums[j]) {
				low = i;
				high = n-1;
				break;
			}else {
				j--;
				low=j+1;
				high =j;
			}
		}
		System.out.println("High ="+high);
		
		return low;
	}
	
	public static void main(String[] args) {
		SearchInRotatedArray s = new SearchInRotatedArray();

//		int nums[] ={4,5,6,7,0,1,2};
		int nums[] ={1,2,3,4,5,6,7};
		int target = 1;
		System.out.println("Low ="+s.search(nums, target));
		
		
		
	}
}	
