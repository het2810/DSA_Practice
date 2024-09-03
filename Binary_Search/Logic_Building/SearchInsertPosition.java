package interview_prep.Binary_Search.Logic_Building;

public class SearchInsertPosition {
	public int searchIndex(int nums[],int target) {
		int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        // Applying Binary Search Algorithm
        while (low <= high) {
            int mid = (low + high) / 2;

            /* If mid element is greater than 
               or equal to target, update ans 
               and search the left half */
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } 
            // Otherwise, search the right half
            else {
                low = mid + 1;
            }
        }
        return ans;
	}
	
	public static void main(String[] args) {
		int nums[] = {1, 3, 5, 6};
		int target=0;
		SearchInsertPosition s = new SearchInsertPosition();
		System.out.println(s.searchIndex(nums, target));
	}
}
