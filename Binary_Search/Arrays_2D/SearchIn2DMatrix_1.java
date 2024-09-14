package interview_prep.Binary_Search.Arrays_2D;

public class SearchIn2DMatrix_1 {
	
	public int isPresentOrNot(int []arr,int x) {
		int ans =0;
		int n = arr.length;
		int low =0;
		int high = n-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid]==x) {
				ans =1;
				return ans;
			}
			if(arr[mid]<x) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			
		}
		
		return ans;
	}
	
	
	//Binary Search Approach
	public boolean searchMatrix(int[][] mat, int target) {
		int n = mat.length;
		boolean isPresent = false;
		for(int i=0;i<n;i++) {
			int ans = isPresentOrNot(mat[i], target);
			if(ans==1) {
				isPresent = true;
				return isPresent;
			}
		}
		
		
		return isPresent;
    }
	
	
	//Linear Search Approach
//	public boolean searchMatrix(int[][] mat, int target) {
//		boolean isPresent = false;
//		int n = mat.length;
//		for(int i=0;i<n;i++) {
//			int m = mat[i].length;
//			for(int j=0;j<m;j++) {
//				if(mat[i][j]==target) {
//					isPresent = true;
//					return isPresent;
//				}
//			}
//		}
//		
//		
//		return isPresent;
//    }
	
	
	public static void main(String[] args) {
		int [][]mat = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
		int target = 13;
		SearchIn2DMatrix_1 s = new SearchIn2DMatrix_1();
		System.out.println(s.searchMatrix(mat, target));
	}
}
