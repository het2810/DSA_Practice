package interview_prep.Arrays.FAQs_Medium;

public class RotateMatrix {
	public static void main(String[] args) {
//		int nums[][] = {{0, 1, 1, 2}, {2, 0, 3, 1}, {4, 5, 0, 5}, {5, 6, 7, 0}};
//		int n= nums.length;

//		Brute Force
//		int ans[][] = new int[n][n];
////		System.out.println(n);
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				ans[i][j] = nums[n-j-1][i];
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(nums[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("Rotated Matrix : ");
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(ans[i][j]+" ");
//			}
//			System.out.println();
//		}

//		Optimal
		/*
		 * 1)Transepose the Matrix 2)Reverse every row
		 * 
		 */

		int nums[][] = { { 0, 1, 1, 2 }, { 2, 0, 3, 1 }, { 4, 5, 0, 5 }, { 5, 6, 7, 0 } };
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transposed Martrix :");
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                
                // Swap elements across the diagonal
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
                
            }
        }
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

        // Reverse each row of the matrix
		System.out.println("Requrired Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                
                // Swap elements symmetrically
                int temp = nums[i][j];
                nums[i][j] = nums[i][n - 1 - j];
                nums[i][n - 1 - j] = temp;
                
            }
        }
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}
