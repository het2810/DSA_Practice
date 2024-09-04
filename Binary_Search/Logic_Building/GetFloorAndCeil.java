package interview_prep.Binary_Search.Logic_Building;

public class GetFloorAndCeil {
	public int getFloor(int nums[],int x) {
		
		int n = nums.length;
		int low = 0;
		int high = n-1;
		int ans =-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if (nums[mid] <= x) {
                ans = nums[mid];
                low = mid + 1;
            }else {
				high = mid-1;
			}
		}
		
		return ans;
	}
	
	public int getCeil(int nums[],int x) {
		int n =nums.length;
		int low =0;
		int high = n-1;
		int ans =-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if (nums[mid] >= x) {
                ans = nums[mid];
                high = mid - 1;
            }else {
            	low = mid+1;
            }
		}
		return ans;
	}
	
	public int[] getFloorAndCeil(int nums[],int x) {
		GetFloorAndCeil g = new GetFloorAndCeil();

		int floor = g.getFloor(nums, x);
		
		int ceil = g.getCeil(nums, x);
		
		System.out.println("Floor = "+floor+"\nCeil = "+ceil);
		
		return new int[] {floor,ceil};
	}
	
	


	public static void main(String[] args) {
		int nums[]= {3,4,4,7,8,10};
		int x = 12;
		GetFloorAndCeil g = new GetFloorAndCeil();
		System.out.println(g.getFloorAndCeil(nums, x));
		
	}
}
