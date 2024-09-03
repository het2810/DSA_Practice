package interview_prep.Binary_Search.Fundamentals;

public class LowerBound {
	public int lowerBound(int nums[],int x) {
		
		int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            /* Check if mid element 
               is a potential answer */
            if (nums[mid] >= x) {
                ans = mid;

                // Search left half
                high = mid - 1;
            } 
            else {
                // Search right half
                low = mid + 1;
            }
        }
        return ans;
		
		//Brute force
//		int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            /* Check the condition for 
//               the current element */
//            if (nums[i] >= x) {
//                // If lower bound is found
//                return i;
//            }
//        }
//        /* If lower bound of 
//           target is not found */
//        return n;
	}
	
	public static void main(String[] args) {
		LowerBound lb = new LowerBound();
		int nums[]= {3,5,8,15,19};
		int x =1;
		System.out.println(lb.lowerBound(nums, x));
	}
}
