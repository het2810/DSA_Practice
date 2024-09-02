package interview_prep.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotateByK {
	public static void main(String[] args) {
		int nums[]= { 1, 2, 3, 4, 5, 6,7};
		int k =17;
		if(k>nums.length) {
			k = k % nums.length;
		}
		List<Integer> temp = new ArrayList<>(k);
		for(int i=0;i<k;i++) {
			temp.add(nums[i]);
		}
		System.out.print("Temp = ");
		for(int i=0; i<temp.size();i++) {
			System.out.print(temp.get(i)+" ");
		}
		for(int i=k;i<nums.length;i++) {
			nums[i-k] = nums[i];
		}
		for(int i = nums.length-k;i<nums.length;i++) {
			nums[i] = temp.get(i-(nums.length-k));
		}
		System.out.print("\nRotated Array : ");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
