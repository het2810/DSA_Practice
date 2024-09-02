package interview_prep.Arrays.FAQs_Medium;

public class KadaneAlgorithm {
	public static void main(String[] args) {
		int nums[] = {-2, -3, -7, -2, -10, -4};
		
		long maxSum = Long.MIN_VALUE;
		long sum=0;
		
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			if(sum>maxSum) {
				maxSum = sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(maxSum);
		
		
		
		
		
//		int maxi=0;
////		int sum=0;
//		for(int i=0;i<nums.length;i++) {
//			int sum =0;
//			for(int j=i;j<nums.length;j++) {
////				for(int k=i;k<=j;k++) {
//////					System.out.print(nums[k]+" ");
////					sum += nums[k];
////				}
//				sum += nums[j];
//				maxi = Math.max(maxi, sum);
////				System.out.println();
//			}
////			System.out.println();
//		}
//		System.out.println(maxi	);
	}
}
