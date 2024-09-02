package interview_prep.Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int nums[] = {7, 4, 1, 5, 3}; 
//		int nums[] = {1,2,3,4,5,6,7}; 
		int itteration =0;
		for(int i =0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		int n = nums.length;
		for(int i = n-1;i>=0;i--) {
			boolean isSwapped =false;
			for(int j = 0 ; j<= i-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					isSwapped = true;
				}
			}
			itteration++;
			if(!isSwapped) {
				break;
			}
		}
		System.out.println();
		for(int i =0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("\n"+itteration);
	}
}
