package interview_prep.Arrays.FAQs_Hard;

public class MaximumProduct {
	public static void main(String[] args) {
		int nums[] ={4, 5, 3, 7, 1, 2};
		int n = nums.length;
		int pd1 = nums[0],pd2 = nums[0], result = nums[0];
		for(int i=1;i<n;i++) {
			int tempMax = Math.max(nums[i], Math.max(pd1*nums[i], pd2*nums[i]));
			int tempMin = Math.min(nums[i],Math.min(pd1*nums[i], pd2*nums[i]));
			pd2 = tempMin;
			pd1 = tempMax;
			System.out.println("pd1 = "+pd1+"\npd2 = "+pd2 );
			result = Math.max(result, pd1);
			System.out.println("result = "+result);
		}
	}
}
		//Brute Force Approach
		
//		int maxMul = Integer.MIN_VALUE;
//		int mul=1;
//		for(int i=0;i<n;i++) {
//			for(int j =i;j<n;j++) {
//				if(maxMul < mul) {
//					maxMul =mul;
//				}
//				System.out.println(maxMul);
//				mul =1;
//				for(int k=i;k<=j;k++) {
//					mul *= nums[k];
////					System.out.print(nums[k]+" ");
//				}
////				System.out.println();
//			}
//		}
		
