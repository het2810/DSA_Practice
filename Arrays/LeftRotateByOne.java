package interview_prep.Arrays;

public class LeftRotateByOne {
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5};
		int temp = nums[0];
		for(int i =0;i<nums.length;i++) {
			if(i==nums.length-1) {
				nums[i]=temp;
			}else {
				nums[i] = nums[i+1];
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
