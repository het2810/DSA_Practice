package interview_prep.Binary_Search.Arrays_2D;

public class SearchIn2DMatrix_2 {
	
	
	public boolean searchMatrix(int[][] mat, int target) {
		
		int n= mat.length;
		int m =mat[0].length;
		int row =0;
		int col = m-1;
		while(row<n && col>=0) {
			if(mat[row][col]==target) {
				return true;
			}else if(mat[row][col] < target) row++;
			else {
				col--;
			}
		}
		
		
		
		return false;
    }
	
	
//	public int isPresentOrNot(int []arr,int x) {
//		int ans =0;
//		int n = arr.length;
//		int low =0;
//		int high = n-1;
//		while(low <= high) {
//			int mid = (low+high)/2;
//			if(arr[mid]==x) {
//				ans =1;
//				return ans;
//			}
//			if(arr[mid]<x) {
//				low = mid+1;
//			}else {
//				high = mid-1;
//			}
//			
//		}
//		
//		return ans;
//	}
//	
//	
//	
//	public boolean searchMatrix(int[][] mat, int target) {
//		int n = mat.length;
//		boolean isPresent = false;
//		for(int i=0;i<n;i++) {
//			int ans = isPresentOrNot(mat[i], target);
//			if(ans==1) {
//				isPresent = true;
//				return isPresent;
//			}
//		}
//		
//		
//		return isPresent;
//    }
	
	public static void main(String[] args) {
		int matrix[][] = { {1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30} };
		int target = 100;
		SearchIn2DMatrix_2 s = new SearchIn2DMatrix_2();
		System.out.println(s.searchMatrix(matrix, target));
	}
}
