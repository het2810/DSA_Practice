package interview_prep.Binary_Search.Arrays_2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfMatrix {
	public int findMedian(int[][] matrix) {
	      List<Integer> temp = new ArrayList<>();
	      int n = matrix.length;
	      for(int i=0;i<n;i++) {
	    	  int m = matrix[i].length;
	    	  for(int j=0;j<m;j++) {
	    		  temp.add(matrix[i][j]);
	    	  }
	      }
	      Collections.sort(temp);
	      int ans = temp.get(0);
	      int tempSize = temp.size();
	      if(tempSize%2!=0) {
	    	  ans = temp.get(tempSize/2);
	      }else {
	    	  ans = (temp.get(tempSize/2)+(temp.get((tempSize/2)-1))/2);
	      }
	      return ans;
    }
	
	
	public static void main(String[] args) {
		int mat[][]= {{1, 3, 8}, {2, 3, 4}, {1, 2, 5}};
		MedianOfMatrix m = new MedianOfMatrix();
		System.out.println(m.findMedian(mat));
	}
}
