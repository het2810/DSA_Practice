package interview_prep.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToRight {
	public static void main(String[] args) {
		int nums[]= {0, 1, 4, 0, 5, 0,2,0};
		int n = nums.length;
		List<Integer> temp = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(nums[i] != 0) {
				temp.add(nums[i]);
			}
		}
		System.out.print("List : ");
		for(int i=0;i<temp.size();i++) {
			System.out.print(temp.get(i)+" ");
		}
		for(int i=0;i<n;i++) {
			if(i<temp.size()) {
				nums[i] = temp.get(i);
			}else {
				nums[i] =0;
			}
		}
		System.out.print("\nRequired Array : ");
		for(int i=0;i<n;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
