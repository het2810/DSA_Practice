package interview_prep.Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int nums[] = {7, 4, 1, 5, 3}; 
		System.out.println();
		for(int i =0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		int itterations = nums.length -1;
		for(int i = 0 ; i< itterations; i++) {
			int min =i;
			for(int j = i+1; j < nums.length;j++) {
				if(nums[j] < nums[min]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = nums[i];
				nums[i] = nums[min];
				nums[min] = temp;
			}
		}
		System.out.println();
		for(int i =0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
