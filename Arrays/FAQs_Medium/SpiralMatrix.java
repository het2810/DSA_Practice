package interview_prep.Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		List<Integer> ans = new ArrayList<>();
		int matrix[][] = {{1, 2, 3},{4,5,6},{7,8,9}};
//		matrix[n][m]
		/*	1 2 3
		 *  4 5 6
		 *  7 8 9
		 *  
		 *  Ans = 1 2 3 6 9 8 7 4 5
		 * */
		int n = matrix.length;//number of rows
		int m = matrix[0].length; // number columns
		int top =0,left =0;
		int bottom = n-1,right=m-1;
		
		//R->B->L->T->R
		
		while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				ans.add(matrix[top][i]);
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				ans.add(matrix[i][right]);
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					ans.add(matrix[bottom][i]);
				}				
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					ans.add(matrix[i][left]);
				}
				left++;
			}
		}
		
		
		
		//printing List
		System.out.print("Spiral List : ");
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
		
		
	}
}
