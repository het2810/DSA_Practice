package interview_prep.Arrays;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int nums[]= {0, 2, 3, 1, 4};
		int n = nums.length;
		int temp=n;
		Arrays.sort(nums);
		for(int i=0;i<n;i++) {
			if(i!=nums[i]) {
				temp=i;
				break;
			}
		}
		System.out.println(temp);
	}
}
