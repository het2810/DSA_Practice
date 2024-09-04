package interview_prep.Binary_Search.Logic_Building;

public class FirstAndLastOccurrence {
	public int lowerBound(int nums[], int x) {

		int low = 0, high = nums.length - 1;
		int ans = nums.length;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] >= x) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}
	
	public int upperBound(int nums[],int x) {
		int low = 0, high = nums.length - 1;
        int ans = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } 

            else {
                low = mid + 1;
            }
        }
        
        return ans;
	}

	public int[] findOccurrence(int nums[], int target) {
		
		FirstAndLastOccurrence f = new FirstAndLastOccurrence();
		int n = nums.length;
		int firstOcc = f.lowerBound(nums, target);
		if(firstOcc == n || nums[firstOcc] != target) return new int[]{-1,-1};
		int lastOcc = f.upperBound(nums, target)-1;
		
		System.out.println(firstOcc+" ,"+(lastOcc));
		return new int[] { firstOcc, lastOcc};

	}

	public static void main(String[] args) {
		FirstAndLastOccurrence f = new FirstAndLastOccurrence();
		int nums[] = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		f.findOccurrence(nums, target);
		
	}
}
