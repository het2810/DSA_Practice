package interview_prep.Binary_Search.Arrays_2D;

public class FindRowWithMax1s {
	public int findLowerBoundOf1(int arr[],int n,int x) {
		int low =0,high =n-1;
		int ans = n;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]>=x) {
				ans = mid;
				high = mid-1;
			}else {
				low=mid+1;
			}
			
		}
		return ans;
	}
	
	//Binary Search Approach
	public int rowWithMax1s(int[][] mat) {
		int countMax =0;
		int index =-1;
		for(int i=0;i<mat.length;i++) {
			int m = mat[i].length;
			int count_1 = m-findLowerBoundOf1(mat[i], m, 1);
			if(count_1>countMax) {
				countMax = count_1;
				index =i;
			}
		}
		
		
		return index;
	}
	
	
	//Linear Search Approach
//	public int rowWithMax1s(int[][] mat) {
//		int n=mat.length;
//		int maxCountIndex =-1;
//		int count =0;
//		for(int i=0;i<n;i++) {
//			int m = mat[i].length;
//			int countTemp =0;
//			for(int j=0;j<m;j++) {
//				if(mat[i][j]==1) {
//					countTemp++;
//				}
//			}
//			if(countTemp>count) {				
//				count = Math.max(count, countTemp);
////				System.out.println(count);
//				maxCountIndex=i;
//			}
//		}
//		return maxCountIndex;
//	}
//	
	
	
	public static void main(String[] args) {
		int mat[][]= { {0, 0}, {0, 0}};
		FindRowWithMax1s f = new FindRowWithMax1s();
		System.out.println(f.rowWithMax1s(mat));
	}
}
