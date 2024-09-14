package interview_prep.Binary_Search.Arrays_2D;

public class PeakElement {

	public int findMax(int []arr) {
		int low = 0;
		int n = arr.length;
		int high = n-1;
		int max = Integer.MIN_VALUE;
		while(low<=high) {
			int mid =(low+high)/2;
			if(arr[mid] > max) {
				max = Math.max(max, arr[mid]);
			}else if(arr[mid]<arr[high]) {
				low = mid+1;
				max = Math.max(max, arr[high]);
			}else {
				high = mid-1;
				max = Math.max(max, arr[low]);
			}
		}
		
		return max;
	}
	
	public int[] findPeakGrid(int[][] mat) {
		int index[]= new int[2];
		int n = mat.length;
		for(int i=0;i<n;i++) {
			int m = mat[i].length;
			int max =findMax(mat[i]);
			System.out.println(max);
			for(int j =0;j<m;j++) {
				if(mat[i][j]==max) {
					if(i>n || i<0 || j>m || j<0) {
						mat[i][j]=-1;
						if(mat[i-1][j]<max && mat[i+1][j]<max && mat[i][j-1]<max && mat[i][j+1]<max){
							index[0]=i;
							index[1]= j;
							return index;
						}
					}
				}
			}
			
		}
		return index;
	}

	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 15 }, { 21, 30, 14 }, { 7, 16, 32 } };
		PeakElement p = new PeakElement();
		int ans[]=p.findPeakGrid(mat);
		System.out.println(ans[0]+" "+ans[1]);
	}
}
