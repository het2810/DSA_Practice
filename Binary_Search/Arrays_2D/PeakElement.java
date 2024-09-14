package interview_prep.Binary_Search.Arrays_2D;

public class PeakElement {

	public int maxElement(int[][] arr, int col) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int index = -1;

		/*
		 * Iterate through each row to find the maximum element in the specified column
		 */
		for (int i = 0; i < n; i++) {
			if (arr[i][col] > max) {
				max = arr[i][col];
				index = i;
			}
		}
		// Return the index
		return index;
	}

	public int[] findPeakGrid(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;

		/*
		 * Initialize the lower bound for and upper bound for binary search
		 */
		int low = 0;
		int high = m - 1;

		// Perform binary search on columns
		while (low <= high) {
			int mid = (low + high) / 2;

			/*
			 * Find the index of the row with the maximum element in the middle column
			 */
			int row = maxElement(arr, mid);

			/*
			 * Determine the elements to left and right of middle element in the found row
			 */
			int left = mid - 1 >= 0 ? arr[row][mid - 1] : Integer.MIN_VALUE;
			int right = mid + 1 < m ? arr[row][mid + 1] : Integer.MIN_VALUE;

			/*
			 * Check if the middle element is greater than its neighbors
			 */
			if (arr[row][mid] > left && arr[row][mid] > right) {
				return new int[] { row, mid };
			} else if (left > arr[row][mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		// Return -1 if no peak element is found
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 15 }, { 21, 30, 14 }, { 7, 16, 32 } };
		PeakElement p = new PeakElement();
		int ans[] = p.findPeakGrid(mat);
		System.out.println(ans[0] + " " + ans[1]);
	}
}
