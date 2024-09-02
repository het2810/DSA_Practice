package interview_prep.Arrays;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int nums[] = {1,0,1,1,1,1,0,0,0,1,1,1,0,1};
		int streak =0;
		int max =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				streak =0;
			}
			if(nums[i]==1) {
				streak++;
				if(streak>max) {
					max = streak;
				}
			}
		}
		System.out.println("Streak = "+streak);
		System.out.println("max = "+max);
	}
}	
