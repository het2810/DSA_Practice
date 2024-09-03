package interview_prep.Binary_Search.Fundamentals;

public class UpperBound {
	public int upperBound(int nums[],int x) {
		int low = 0, high = nums.length - 1;
        int ans = nums.length;

        // Binary search to find the upper bound
        while (low <= high) {
            // Calculate mid index
            int mid = (low + high) / 2;

            /* Update ans if current
               element is greater than x */
            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } 
            // Otherwise, move to the right half
            else {
                low = mid + 1;
            }
        }
        return ans;
	}
	public static void main(String[] args) {
		
		UpperBound ub = new UpperBound();
		int nums[]= {3,5,8,15,19};
		int x =1;
		System.out.println(ub.upperBound(nums, x));
	}
}
